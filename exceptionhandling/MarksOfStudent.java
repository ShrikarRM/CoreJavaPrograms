package com.account.exceptionhandling;

public class MarksOfStudent {
	static void inputMarks(int marks)throws InvalidMarksException{  
	     if(marks>100)  
	      throw new InvalidMarksException("Entered marks are not valid");  
	     else  
	      System.out.println("Congrts! your marks are "+marks);  
	   }

	public static void main(String[] args) {
		try{  
			inputMarks(120);  
		      }catch(InvalidMarksException m){
		    		m.printStackTrace();}  
		   
		  }  

	}
