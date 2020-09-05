package com.account.collectionfw.assignment30th;

public class Student {
	private double age;
	private String name;
	private String address; 
	
	public Student(int age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
		
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", address=" + address + "]";
	}
	
}
