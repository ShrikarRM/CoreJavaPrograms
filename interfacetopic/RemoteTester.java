package com.account.interfacetopic;

public class RemoteTester {

	public static void main(String[] args) {
		TvRemote tv=new TvRemote();
//		Remote r=new TvRemote();
//		r.switchOffMachine();
		
		tv.changeChannel();
		tv.switchOffMachine();
		tv.switchOnMachine();
	}

}
