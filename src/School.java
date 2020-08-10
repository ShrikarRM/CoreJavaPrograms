
public class School {

	String name;
	String principal;
	double area;
	int noOfStudents;
	
	public School() {
		System.out.println("no-arg constructor");
	}

	public School(String inName, String inPrincipal, double inArea,int inNoOfStudents) {
		name = inName;
		principal = inPrincipal;
		area = inArea;
		noOfStudents=inNoOfStudents;
	}

	public School(String inName, String inPrincipal, double inArea) {
		name = inName;
		principal = inPrincipal;
		area = inArea;
	}
	public School(String inName, String inPrincipal) {
		name = inName;
		principal = inPrincipal;
		}

	void hasHoliday() {
		System.out.println("School is not working");
	}

	void isRunning(boolean work) {
		System.out.println("Apply the brake :" + work);
	}	
	
	public static void main(String[] args) {
	
		System.out.println("Start of Prog");
		School nursery = new School();
		System.out
		.println(" Name of School :" + nursery.name + " Principal :" 
+ nursery.principal + " Area of school :" + nursery.area+ " num of students :"+nursery.noOfStudents);

		School primary = new School("Vidyanketan","Rao",5600.00,500);
		System.out
				.println(" Name of School :" + primary.name + " Principal :" 
		+ primary.principal + " Area of school :" + primary.area+ " num of students :"+primary.noOfStudents);
		
		System.out.println("End of Prog");
	}

}
