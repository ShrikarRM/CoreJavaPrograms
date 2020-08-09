package com.account.inheritance;

public class VehicleTester {

	public static void main(String[] args) {
		
	Car alto =new Car();
	try{
		alto.details(-40);
	}catch(IncorrectIntcc e){
		e.printStackTrace();
	}
	int noOfSeat=4;
	alto.handBrake();
	alto.start();
	
	}

}
