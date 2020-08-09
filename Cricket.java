package com.account.inheritance;

public class Cricket extends Sports{

	int numOfOvers;
	void typeOfMatch(int numOfOvers) throws IncorrectOverException{
		if(numOfOvers==50)
			System.out.println("50 overs");
		else
			throw new IncorrectOverException("No such type of match");
	}
	void batting(){
		System.out.println("Indian team is batting");
	}
	void bowlinging(){
		System.out.println("SriLankan team is bowling");
	}
	void runOut(){
		System.out.println("The batsman got runout");
	}
}
