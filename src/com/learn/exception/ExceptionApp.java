package com.learn.exception;

import com.learn.collection.Employee;

public class ExceptionApp {

	public static void main(String[] args) throws Age{
		Employee employee = new Employee(1, "iqra","iqra@gmail.com",20000, "hr", 18);
		if (employee.getAge()>=18) {
			try {
				throw new Age();
			}catch(Age age) {
				age.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
