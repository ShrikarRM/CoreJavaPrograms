package com.account.string.assignment30th;


public class NumOfVowelsInString {    
    public static void main(String[] args) {    
            
        //Counting variable to count of vowels and consonant    
        int numOfVowels = 0, numOfConsonants = 0;  int noOfSpaces=0;  
          
        String str = "Welcome to X-workz";    
            
        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
            //Checking whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
            	numOfVowels++;    
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                //Increments the consonant counter    
            	numOfConsonants++;    
            }  
            else if(str.charAt(i) == ' ' ) {      
                //Increments the consonant counter    
            	noOfSpaces++;    
            } 
        }    
        System.out.println("Number of vowels: " + numOfVowels);    
        System.out.println("Number of consonants: " + numOfConsonants);  
        System.out.println("Number of spaces: " + noOfSpaces);    

    }    
}   
