package com.account.corejava.blocks;

public class Clip {
String material;
double price;
//non static blocks /initialization block
//called during the obj creation just before constructor is called
{
	material = "metal";
	
}
		Clip(String inputMaterial, double inputPrice ){
		System.out.println("Material: "+material+ " Price: "+price);	
		
		material = inputMaterial;
		price = inputPrice;
		
		}
		void putClip(){
			System.out.println("PutClip");
		}
		//All the blocks are called in sequence they have written
		{
			price =50.00;
		}
}
