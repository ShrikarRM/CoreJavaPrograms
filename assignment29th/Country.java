package com.account.collectionfw.assignment29th;

public class Country implements Comparable<Country>{
	private int noOfstates;

	private String name;
	private String countryCode;

	public Country(int noOfstates, String name, String countryCode) {
		super();
		this.noOfstates = noOfstates;
		this.name = name;
		this.countryCode = countryCode;
	}

	public int getnoOfstates() {
		return noOfstates;
	}

	public void setnoOfstates(int noOfstates) {
		this.noOfstates = noOfstates;
	}


	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getcountryCode() {
		return countryCode;
	}

	public void setcountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	@Override
	public String toString() {
		return " [noOfstates="+noOfstates+", name="+name+", countryCode="+countryCode+"]";
	}

	@Override
	public int compareTo(Country o) {
		return (int) (this.noOfstates-o.noOfstates);
	}
}
