package com.account.inheritance;

public class MultiLevel {

	public static void main(String args[]) {
		Yamaha cbz = new Yamaha();
		try{
		cbz.cc=35;
		}catch(IncorrectIntcc e){
			e.printStackTrace();
		}
		System.out.println("cc of vehicle is :"+cbz.cc);
		cbz.price=35000.99;
		System.out.println("vehicle price "+cbz.price);
		cbz.start();
		cbz.riding();
		cbz.launching();

	}

}
