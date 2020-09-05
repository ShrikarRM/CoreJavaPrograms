package com.account.methodoverridingtopic;

public class BookTester {

	public static void main(String[] args) {
		Book one = new Book();
		one.name = "Abc";
		one.reading();
		one.turnPage();
		System.out.println("Book name " + one.name);

		AcademicBook abook = new AcademicBook();
		abook.name = "Academic book";
		abook.reading();
		System.out.println("Book name " + abook.name);

		ScienceBook scibook = new ScienceBook();
		scibook.name = "Science Book";
		scibook.reading();
		System.out.println("Book name " + scibook.name);
	}

}
