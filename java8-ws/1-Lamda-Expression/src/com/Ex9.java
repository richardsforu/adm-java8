package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
	private int id;
	private String name;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Ex9 {

	public static void main(String[] args) {
		
		Employee e1=new Employee(19, "Zaheer");
		Employee e2=new Employee(101, "Kavya");
		Employee e3=new Employee(82, "Barath");
		Employee e4=new Employee(10, "Divya");
		Employee e5=new Employee(21, "Aarush");
		
		List<Employee> emps=new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
		
		Collections.sort(emps,(obj1,obj2)->{
			return obj1.getId()-obj2.getId();
		});
		
		emps.forEach(emp->{
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println("----------------");
		});
		
		System.out.println("============================");
		
		Collections.sort(emps,(obj1,obj2)->{
			return obj1.getName().compareTo(obj2.getName());
		});
		
		emps.forEach(emp->{
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println("----------------");
		});
	}

}
