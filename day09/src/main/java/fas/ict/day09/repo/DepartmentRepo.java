package fas.ict.day09.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fas.ict.day09.model.Department;


@Repository
public interface DepartmentRepo extends JpaRepository<Department ,Integer>{

}