package com.learn.collection.list;

import java.util.Comparator;
import java.util.List;

public class Student implements Comparator<Student>{

	private String id;
	private String name;
	private String email;
	private int age;
	
	public static void sortByName(List<Student> student) {
        // Comparator to sort by name ascending
        Comparator<Student> compare = (Student s1, Student s2) ->
        {
            return s1.getName().compareTo(s2.getName());
        };
        
        student.sort(compare);
    }
	
	// Comparator to sort by age ascending
	public static void sortByAge(List<Student> student) {
		Comparator<Student> comp=(Student s1, Student s2)->{
			return s1.getAge()-s2.getAge();
		};
		student.sort(comp);
		
	}
	
	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return 0;
	}	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}

	
}
