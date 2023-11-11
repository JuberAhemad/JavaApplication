package com.learn.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		String path = "G://IO//student.txt";
		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student student = (Student) ois.readObject();
			String name = student.getName();
			System.out.println("Name is : "+name);
			
		} catch (IOException io) {
			io.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
