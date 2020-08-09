import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a = sc.nextInt();
		System.out.println("Enter value of b:");
		int b = sc.nextInt();
		sc.close();
		SwapTwoNumbers.swap(a, b);
	}

	public static void swap(int a, int b) {
		System.out.println("Before swapping : a=" + a + ",b=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping : a=" + a + ",b=" + b);

	}
}