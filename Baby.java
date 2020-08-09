
public class Baby {

	String name;
	int yearofBirth;
	double weight;

	Baby() {
		System.out.println("Creating baby as an object");
	}

	void laugh() {
		System.out.println("Baby is laughing");
	}

	void cry() {
		System.out.println("Baby is crying");
	}

	void sleep() {
		System.out.println("Baby is sleeping");
	}

	public static void main(String[] args) {

		Baby girlBaby = new Baby(); // instance obj
		girlBaby.name = "Pinki";
		girlBaby.yearofBirth = 2020;
		girlBaby.weight = 2.75;

		System.out.println("Name of the baby :" + girlBaby.name);
		System.out.println("Year of birth of the baby :" + girlBaby.yearofBirth);
		System.out.println("weight of the baby in kgs:" + girlBaby.weight);

		System.out.println();
		girlBaby.sleep();
		girlBaby.cry();
		girlBaby.laugh();
		System.out.println();
		Baby boyBaby = new Baby(); 
		boyBaby.name = "Pintu";
		boyBaby.yearofBirth = 2018;
		boyBaby.weight = 3.25;

		System.out.println("Name of the baby :" + boyBaby.name);
		System.out.println("Year of birth of the baby :" + boyBaby.yearofBirth);
		System.out.println("weight of the baby in kgs:" + boyBaby.weight);

		System.out.println();
		boyBaby.sleep();
		boyBaby.cry();
		boyBaby.laugh();
	}

}
