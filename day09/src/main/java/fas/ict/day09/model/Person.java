package fas.ict.day09.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
	private String name;
	private int age;
	private String gender;
}