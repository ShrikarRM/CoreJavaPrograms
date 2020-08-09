
public class Bottle {
	// instance var //states
	String color;
	String material;
	int liters;

	Bottle() { // constructor
		System.out.println("Creating bottle object");
	}

	void pourWater() {
		System.out.println("Pour water");
	}

	void openCap() {
		System.out.println("open the cap");
	}

	void closeCap() {
		System.out.println("close the cap");
	}

	public static void main(String[] args) {
		Bottle prestigeBottle = new Bottle(); // instance obj
		prestigeBottle.color = "Green";
		prestigeBottle.material = "Plastic";
		prestigeBottle.liters = 1;

		System.out.println("Color :" + prestigeBottle.color);
		System.out.println("Material :" + prestigeBottle.material);
		System.out.println("Liters:" + prestigeBottle.liters);

		prestigeBottle.pourWater();
		prestigeBottle.openCap();
		prestigeBottle.closeCap();

		Bottle TupperwareBottle = new Bottle();
		TupperwareBottle.color = "white";
		TupperwareBottle.material = "copper";
		TupperwareBottle.liters = 2;

		System.out.println("Color :" + TupperwareBottle.color);
		System.out.println("Material :" + TupperwareBottle.material);
		System.out.println("Liters:" + TupperwareBottle.liters);

	}

}
