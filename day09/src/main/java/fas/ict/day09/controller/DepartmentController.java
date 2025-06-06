package fas.ict.day09.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fas.ict.day09.model.Department;
import fas.ict.day09.service.DepartmentService;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	@Autowired
	public DepartmentService service;
	
	@GetMapping
	public ResponseEntity<List<Department>> getDept(){
		return new ResponseEntity<List<Department>>
		  (service.getDept(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Department> getDept(@PathVariable("id") int id){
		if(service.getDept(id) == null) {
		   return new ResponseEntity<Department>
		       (service.getDept(id),HttpStatus.NOT_FOUND);
		}
		else
		{
			return new ResponseEntity<Department>
			 (service.getDept(id),HttpStatus.OK);
		
		}
	}
}