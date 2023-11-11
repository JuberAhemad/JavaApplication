package com.learn.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AppMain {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("Juber Ahemad");
		student.setEmail("juber.ahemad");
		student.setAge(35);
		student.setAddress("Allahabad");
		
		
		String path = "G://IO//student.txt";
		try {
			File file = new File(path);			
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(student);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
