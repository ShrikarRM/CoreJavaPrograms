
public class Bike {

	String brand;
	int cc;
	String model;
	double mileage;

	Bike() {
		System.out.println("Creating bike object");
	}

	void start() {
		System.out.println("Start the bike");
	}

	void stop() {
		System.out.println("Bike stopped");
	}

	void accelerate() {
		System.out.println("Bike is accelerated to increase the speed");
	}

	public static void main(String[] args) {

		Bike newBike = new Bike(); // instance obj
		newBike.brand = "Honda";
		newBike.model = "Shine";
		newBike.cc = 200;
		newBike.mileage = 56.5;

		System.out.println("Brand :" + newBike.brand);
		System.out.println("Model :" + newBike.model);
		System.out.println("cc :" + newBike.cc);
		System.out.println("Mileage is :" + newBike.mileage);
		System.out.println();
		newBike.accelerate();
		newBike.start();
		newBike.stop();
		System.out.println();
		Bike royalBike = new Bike(); // instance obj
		royalBike.brand = "Royal Enfield";
		royalBike.model = "Classic";
		royalBike.cc = 2000;
		royalBike.mileage = 70.57;

		System.out.println();
		System.out.println("Brand :" + royalBike.brand);
		System.out.println("Model :" + royalBike.model);
		System.out.println("cc :" + royalBike.cc);
		System.out.println("Mileage is :" + royalBike.mileage);
		System.out.println();
		royalBike.accelerate();
		royalBike.start();
		royalBike.stop();
	}

}
