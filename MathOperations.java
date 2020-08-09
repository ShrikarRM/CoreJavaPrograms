
public class MathOperations {

	public static void main(String[] args) {
		int a = 10, b = 15;

		sumOfTwo(a, b);

		int c = 30, d = 40;
		sumOfTwo(c, d);

		int e = 50, f = 90;
		sumOfTwo(e, f);
		// Namemethod argument

		sumOfTwo(50, 90);

		int res = subOfTwo(60, 30);
		System.out.println("sub of 30& 60 is " + res);
	}
	// modifier static return type name method (parameters)

	public static void sumOfTwo(int a, int b) {
		int sum = a + b;
		System.out.println("the sum of" + a + " & " + b + " is " + sum);
	}

	public static int subOfTwo(int a, int b) {
		int sub = 0;
		return sub;

	}
}
