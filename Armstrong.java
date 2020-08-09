import java.util.Scanner;

public class Armstrong {

		void check(int a){

			int r=0,sum=0, input=a;
			while(a>0){
			r=a%10;
			a=a/10;
			sum=sum+r*r*r;
			}
			if(input==sum)
				System.out.println(input+" is an Armstr num");
			else
				System.out.println(input+" is not an Armstr num");

		}
	
public static void main(String[] args) {
	Armstrong arm=new Armstrong();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number n=");
	int a = sc.nextInt();
	sc.close();
	arm.check(a);
}
}
