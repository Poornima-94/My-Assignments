package week3.week3homeassignments;

import java.util.LinkedHashSet;


public class RemoveDuplicates {
	 
	  
	    //Create removeDuplicates() method for removing duplicates using LinkedHashSet  
	  static  void removeDuplicates(String str)   
	    {     
	        //Create LinkedHashSet of type character   
	        LinkedHashSet<Character> set = new LinkedHashSet<>();   
	        //Add each character of the string into LinkedHashSet   
	        for(int i=0;i<str.length();i++)   
	            set.add(str.charAt(i));   
	            
	        // print the string after removing duplicate characters   
	        for(Character ch : set)   
	            System.out.print(ch);   
	    }   
	        
	    //main() method start  
	   public static void main(String[] args) {
		
	
	   
	        //Create string variable with default value  
	        String str = "We learn Java basics as part of java sessions in java week1";   
	        //removeDuplicates() method by passing the string as an argument   
	        removeDuplicates(str);   
	   }
}

			
		









/*
 * Assignment Details: Remove the duplicate words from a String with the input:
 * String text = “We learn Java basics as part of java sessions in java week1”;
 * Expected output: “We learn Java basics as part of sessions in week1”
 * 
 * Assignment Requirements:
 * 
 * - Initialize a variable ‘count’ to keep track of the number of duplicate
 * words found - Split the text into an array of words using space as the
 * delimiter - Create two nested for loops to compare each word with every other
 * word in the String array. - If a duplicate word is found, it is replaced with
 * an empty string and the count is incremented. - After comparing all words, if
 * the count is greater than 1 (indicating at least one duplicate was found), it
 * prints the modified words array where duplicates have been replaced with
 * empty strings.
 * 
 * Hints to Solve:
 * 
 * - If the count is greater than 1, use another for loop to print the modified
 * String array where duplicates have been replace with empty strings. - Use the
 * appropriate method for case-insensitive string comparisons.
 */