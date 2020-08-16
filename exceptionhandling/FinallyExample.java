package com.account.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
public class FinallyExample {

	public static void main(String[] args) {
		System.out.println("Beginning of prog");
		File file;
		FileInputStream in = null;
		try {
			file = new File("c://project//test.txt");
			in = new FileInputStream(file);
			String str = null;
			str.length();
		} catch (Exception e) {
			System.out.println("Exception has occured");
		} finally {
			System.out.println("Must executable statement");
			try {
				in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("End of prog");
	}
}
