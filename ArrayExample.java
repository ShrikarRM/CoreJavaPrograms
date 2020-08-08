
public class ArrayExample {

	public static void main(String[] args) {
		
		System.out.println("");
		
		int myArray[];
		myArray = new int[10];
		
		myArray[0]=1;
		myArray[1]=2;
		myArray[3]=5;
		myArray[4]=7;
		myArray[6]=10;
		try{myArray[10]=4;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		//System.out.println("The value of 10 is "+myArray[10]);
		}
		System.out.println("The value of 0 is "+myArray[0]);
		System.out.println("The value of 1 is "+myArray[1]);
		System.out.println("The value of 3 is "+myArray[3]);
		System.out.println("The value of 2 is "+myArray[2]);
//System.out.println("The value of 10 is "+myArray[10]);	Give Array indexoutof bound exception
		
		System.out.println("Displaying using for loop");
		for(int i=0;i<myArray.length;i++){   //condition i<=myArray.length-1
			System.out.println("The value is "+myArray[i]);
		}
			int mysecondArray[]={1,7,5,8,10};  //literal
			System.out.println("The value of index 0 of secondArray is "+mysecondArray[0]);
			System.out.println("The value of index 1 of secondArray is "+mysecondArray[1]);
			System.out.println("The value of index 4 of secondArray is "+mysecondArray[4]);
			
			for(int i=0;i<mysecondArray.length;i++){   //condn i<=myArray.length-1
				System.out.println("The value is "+mysecondArray[i]);
			}
			
		}	
		
	}
	
	


