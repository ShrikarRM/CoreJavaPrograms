package com.account.interfacetopic;

public class InternetTester {

	public static void main(String[] args) {
		InternetProvider act = new AirtelInternetProvider(); // upcasting
		act.connectivityType();
		act.transmittingSpeed();
	}

}
