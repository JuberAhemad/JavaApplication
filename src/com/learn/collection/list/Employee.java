package com.learn.collection.list;

public class Employee implements Comparable<Employee> {
	
	private String id;
	private String name;
	private String email;
	private int age;
	private String department;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String id, String name, String email, int age, String department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.department = department;
	}
	//sorting employee by id and by name
	@Override
	public int compareTo(Employee emp) {
		int value = id.compareTo(emp.id);
		//int name = emp.name.compareTo(emp.name);
		return value;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", department="
				+ department + "]";
	}
		

}
