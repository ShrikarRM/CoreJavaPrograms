
public class Bag {

	String color;
	boolean isBackPack;
	double price;
	int noOfButtons;

	public Bag() {
		System.out.println("no-arg constructor");
	}

	public Bag(String inColor, boolean inIsBackPack, double inPrice, int inNoOfButtons) {
		color = inColor;
		isBackPack = inIsBackPack;
		price = inPrice;
		noOfButtons = inNoOfButtons;
	}

	public Bag(String inColor, boolean inIsBackPack) {
		color = inColor;
		isBackPack = inIsBackPack;
	}

	void opening() {
		System.out.println("Bag is opened");
	}

	void isCarriable(boolean isBackPack) {
		System.out.println("Bag is backpack :" + isBackPack);
	}

	public static void main(String[] args) {

		System.out.println("Start of Prog");
		Bag schoolBag = new Bag();
		System.out.println("Color of Bag :" + schoolBag.color + " Is bag is backPack :" + schoolBag.isBackPack
				+ " Price of Bag is :" + schoolBag.price + " num of buttons :" + schoolBag.noOfButtons);

		Bag laptopBag = new Bag("green", false, 340, 2);
		System.out.println("Color of Bag :" + laptopBag.color + " Is bag is backPack :" + laptopBag.isBackPack
				+ " Price of Bag is :" + laptopBag.price + " num of buttons :" + laptopBag.noOfButtons);

		System.out.println("End of Prog");

	}

}
