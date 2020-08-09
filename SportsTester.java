package com.account.inheritance;

public class SportsTester {

	public static void main(String[] args) {
		Cricket t20= new Cricket();
try{t20.typeOfMatch(10);
	}catch(IncorrectOverException e){
		e.printStackTrace();
	}
		t20.toss();
		t20.selection();
		t20.practiceSession();
		t20.numOfOvers=20;
		t20.isIndoor=true;
		
		
	}

}
