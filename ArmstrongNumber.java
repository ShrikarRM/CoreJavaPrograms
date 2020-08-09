import java.util.Scanner;

public class ArmstrongNumber {

	 void armstrong( int n) {
		 int temp = n;
		 int sum = 0;
		while (n > 0) {
			n = n / 10;
			int r = n % 10;
			sum = sum + r * r * r;
		}
		if ( temp == sum)
			System.out.println("It is an Armstrong num");
		
		else
			System.out.println("Not a Armstrong");
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n=");
		int n = sc.nextInt();
		ArmstrongNumber a = new ArmstrongNumber();
		a.armstrong(n);
		sc.close();
	}

}
