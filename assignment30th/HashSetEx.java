package com.account.collectionfw.assignment30th;

public class HashSetEx {
	private String name;
	private int empId;
	private double salary;

	public HashSetEx(String name, int empId, double salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "HashSetEx [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}

}
