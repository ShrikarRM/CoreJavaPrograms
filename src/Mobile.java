
public class Mobile {
	// instance var are pre initialize basd on data type
	String brand;
	int ram;
	boolean isSmartPhone;
	double price;

	// mobile(){ } JVM creates
	Mobile() { // Default// no arg constructor
		System.out.println("Calling Constructor");
		brand = " Samsung";
		isSmartPhone = true;
		price = 5000.00;
		ram = 4;
		System.out.println("Ending the constructor");

	}

	void makeCall(long phoneNum) {
		System.out.println("Making call to :" + phoneNum);
	}

	void charging(boolean isCharging) {
		System.out.println("Is charging on :" + isCharging);
	}

	void locked(boolean isLocked) {
		System.out.println("Is phone locked:" + isLocked);
	}

	public static void main(String[] args) {
		System.out.println("Start prog");
		Mobile nokia = new Mobile(); // def constr
		System.out.println("brand " + nokia.brand + " isSmartPhone " + nokia.isSmartPhone
				+ " price :" + nokia.price
				+ " ram :" + nokia.ram);
		nokia.brand = "nokia";
		nokia.isSmartPhone = false;

		System.out.println("brand " + nokia.brand + " isSmartPhone " + nokia.isSmartPhone + " price :" + nokia.price
				+ " ram :" + nokia.ram);

	}

}
