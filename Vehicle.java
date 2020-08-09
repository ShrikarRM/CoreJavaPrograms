package com.account.inheritance;

public class Vehicle {
String type;
int cc;

public void details(int cc) throws IncorrectIntcc{
	if(cc<0)
		
		throw new IncorrectIntcc("entered wrong cc");
}void start(){
	System.out.println("Vehicle started");
}
void stop(){
	System.out.println("Vehicle stopped");
}
}
