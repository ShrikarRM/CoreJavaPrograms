
public class DoubleArray {

	public static void main(String[] args) {
		System.out.println("Start prog");
		
		double[] dArray= new double[5];
		
		dArray[0]=1.00;
		dArray[1]=12.00;
		dArray[2]=45.00;
		dArray[3]=25.00;
		
		System.out.println("The value of array is :");
		
		int len=dArray.length;
		for(int i=0;i<len;i++){
			System.out.println(dArray[i]);	
		}
		 	
		System.out.println("End prog");
	}

}
