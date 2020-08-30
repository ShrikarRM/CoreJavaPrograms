package com.account.collectionfw.assignment29th;

public class Shirt {
	private String brand;
	private int numOfButtons;
	private double price;

	public Shirt(String brand, int numOfButtons, double price) {
		super();
		this.brand = brand;
		this.numOfButtons = numOfButtons;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNumOfButtons() {
		return numOfButtons;
	}

	public void setNumOfButtons(int numOfButtons) {
		this.numOfButtons = numOfButtons;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {

		return "Shirt [BrandName=" + brand + ", Number Of Buttons =" + numOfButtons + ", Price=" + price + "]";
	}

}
