package com.account.interfacetopic;

public class AirtelInternetProvider implements InternetProvider {

	@Override
	public void transmittingSpeed() {
		System.out.println("Maximum transmitting speed is= 16mbps");
	}

	@Override
	public void connectivityType() {
		System.out.println("Connectivity used is of Fibernet");
	}
}
