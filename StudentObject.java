
public class StudentObject {

	String name;
	int rollNum;
	String standard;

	StudentObject() {
		System.out.println("Creating student object");
	}

	void reading() {
		System.out.println("Reding books");
	}

	void prepareNotes() {
		System.out.println("Prepare notes");
	}

	public static void main(String[] args) {

		StudentObject student = new StudentObject(); // instance obj
		student.name = "Ganesh";
		student.rollNum = 1;
		student.standard = "third";

		System.out.println("Name :" + student.name);
		System.out.println("Rollnum :" + student.rollNum);
		System.out.println("standard:" + student.standard);

		student.reading();
		student.prepareNotes();
	}
}
