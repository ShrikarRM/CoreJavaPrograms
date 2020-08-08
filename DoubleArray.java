
public class DoubleArray {
int arrlength;
public void arrayDimension (double dArray)throws Arrecpn{
	if(dArray<4)
		System.out.println("entered length is within max index");
	else
		throw new Arrecpn("Exceeding arraylength");
}	
}
class Tester{
	public static void main(String[] args) {
		System.out.println("Start prog");
		
		double[] dArray= new double[5];
		
		dArray[0]=1.00;
		dArray[1]=12.00;
		dArray[2]=45.00;
		dArray[3]=25.00;
		
		try{dArray[5]=20.00;
		
		}catch (Arrecpn a){
			a.printStackTrace();
		}
		System.out.println("The value of array is :");
		
		int len=dArray.length;
		for(int i=0;i<len;i++){
			System.out.println(dArray[i]);	
		}
		 	
		System.out.println("End prog");
	}

}

