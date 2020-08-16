package com.account.exceptionhandling;

public class SeatingCapacity {

	static void check(int noOfseats)throws UnavailibilityException{  
	     if(noOfseats<100)  
	      throw new UnavailibilityException("not enough space to occupy");  
	     else  
	      System.out.println("Please take seat ");  
	   }
	public static void main(String[] args) {
		  try{  
			  check(90);  
		      }catch(UnavailibilityException e){
		    	  System.out.println("Exception occured: "+e);
		    		e.printStackTrace();}  
		   
		  }  
	}


