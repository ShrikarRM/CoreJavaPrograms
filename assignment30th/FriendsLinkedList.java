package com.account.collectionfw.assignment30th;

public class FriendsLinkedList {
	private String name;
	private int dob;
	private String job;

	public FriendsLinkedList(String name, int dob, String job) {
		super();
		this.name = name;
		this.dob = dob;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "FriendsLinkedList [name=" + name + ", dob=" + dob + ", job=" + job + "]";
	}
}
