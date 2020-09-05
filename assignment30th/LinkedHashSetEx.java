package com.account.collectionfw.assignment30th;

public class LinkedHashSetEx {

	private String schoolName;
	private int numOfStudents;
	private double fees;
	
	public LinkedHashSetEx(String schoolName, int numOfStudents, double fees) {
		super();
		this.schoolName = schoolName;
		this.numOfStudents = numOfStudents;
		this.fees = fees;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getNumOfStudents() {
		return numOfStudents;
	}

	public void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "LinkedHashSetEx [schoolName=" + schoolName + ", numOfStudents=" + numOfStudents + ", fees=" + fees
				+ "]";
	}
}
