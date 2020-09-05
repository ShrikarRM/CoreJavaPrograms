package com.account.collectionfw.assignment30th;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentTester {

	public static void main(String[] args) {
		ArrayList<Student> details = new ArrayList<Student>();

		details.add(new Student( 16,"Rohan","J P Nagar"));
		details.add(new Student( 16,"Rahul","RR nagar"));
		details.add(new Student( 18,"Rekha","RajajiNagar"));
		details.add(new Student( 14,"Ruhi","Jayanagar"));
		
		for(Student s:details){
			System.out.println(s);
		}
		details.sort(new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2){
				int comparison=0;
				comparison=o1.getAge()==o2.getAge());
				if(comparison==0){
					comparison=o1.getName().compareTo(o2.getName());
				}
				return comparison;
			}
		});
		System.out.println("after sorting");
		for(Student s:details){
			System.out.println(s);
		}
	}

}
