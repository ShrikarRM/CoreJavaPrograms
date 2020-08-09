
public class ArithmaticMethods {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		sumOfTwo(a, b);

		int c = 10;
		int d = 5;
		differenceOfTwo(c, d);

		int e = 10;
		int f = 20;
		productOfTwo(e, f);

		double g = 20;
		double h = 20;
		quotientOfTwo(g, h);

		int i = 20;
		int j = 20;
		modulusOfTwo(i, j);

	}
	// modifier static return type name method (parameters)

	public static void sumOfTwo(int a, int b) {
		int sum = a + b;
		System.out.println("the sum of " + a + " & " + b + " is " + sum);
	}

	public static void differenceOfTwo(int c, int d) {
		int diff = c - d;
		System.out.println("the difference of " + c + " & " + d + " is " +diff);

	}

	public static void productOfTwo(int e, int f) {
		int prod = e * f;
		System.out.println("the product of " + e + " & " + f + " is " +prod);

	}

	public static void quotientOfTwo(double g, double h) {
		double quotient = g / h;
		System.out.println("the quotient of " + g + " & " + h + " is " +quotient);

	}

	public static void modulusOfTwo(int i, int j) {
		int mod = i % j;
		System.out.println("the modulus of " + i + " & " + j + " is " +mod);

	}
}
