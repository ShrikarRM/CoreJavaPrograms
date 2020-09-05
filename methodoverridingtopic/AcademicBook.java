package com.account.methodoverridingtopic;

public class AcademicBook extends Book {
	String name="AcademicBook";

	void readLesson() {
		System.out.println("Reading a lesson");
	}

	@Override
	public void reading() {
		System.out.println("Reading a academic book");
	}
}
