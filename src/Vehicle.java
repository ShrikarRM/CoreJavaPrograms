
public class Vehicle {

	String regNo;
	int noOfWheels;
	String fuelType;

	public Vehicle() {
		System.out.println("no-arg constructor");
	}

	public Vehicle(String inRegNo, int inNoOfWheels, String inFuelType) {
		regNo = inRegNo;
		noOfWheels = inNoOfWheels;
		fuelType = inFuelType;
	}

	public Vehicle(String inRegNo) {
		regNo = inRegNo;
	}

	public Vehicle(String inRegNo, int inNoOfWheels) {
		regNo = inRegNo;
		noOfWheels = inNoOfWheels;
	}

	void running() {
		System.out.println("Vehicle is running");
	}

	void applyBrakes(boolean brake) {
		System.out.println("Apply the brake :" + brake);
	}

	public static void main(String[] args) {

		System.out.println("Start of Prog");

		Vehicle car = new Vehicle();
		System.out
				.println("regNo :" + car.regNo + "no of wheels :" 
		+ car.noOfWheels + " type of fuel :" + car.fuelType);

		/*
		 * String regNo="KA23EF343"; int noOfWheels=4; String fuelType="Petrol";
		 * Vehicle Bike =new Vehicle(regNo,noOfWheels,fuelType);
		 */
		Vehicle Bike = new Vehicle("KA23EF343", 4, "Petrol");
		System.out.println(
				"regNo :" + Bike.regNo + "no of wheels :" + Bike.noOfWheels 
				+ " type of fuel :" + Bike.fuelType);

		Vehicle truck = new Vehicle("KA23EF343");
		System.out.println(
				"regNo :" + truck.regNo + "no of wheels :" + truck.noOfWheels 
				+ " type of fuel :" + truck.fuelType);

		System.out.println("End of Prog");

	}

}
