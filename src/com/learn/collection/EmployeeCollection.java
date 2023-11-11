package com.learn.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeCollection {

	public static void main(String[] args) {

		Employee employee1 = new Employee(1,"Juber","juber@gmail.com", 20000, "hr",35);
		Employee employee2 = new Employee(2,"Iqra","iqra@gmail.com", 30000, "hr",2);
		Employee employee3 = new Employee(3,"Ayeza","ayeza@gmail.com", 25000, "hr",4);
		Employee employee4 = new Employee(4,"Khushbu","khushbu@gmail.com", 28000, "hr",28);
		
		Employee employee5 =new Employee(5,"Ejaj","ejaj@gmail.com", 22000, "it",32);
		Employee employee6 =new Employee(6,"Atif","atif@gmail.com", 23000, "it",4);
		Employee employee7 =new Employee(7,"Enaya","enaya@gmail.com", 24000, "it",3);
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		empList.add(employee4);
		empList.add(employee5);
		empList.add(employee6);
		empList.add(employee7);
		
		List<Employee> list = empList.stream().filter(e->e.getDepartment()=="hr" && e.getSalary()>=20000).collect(Collectors.toList());
		System.out.println(""+list);		
	}

}
