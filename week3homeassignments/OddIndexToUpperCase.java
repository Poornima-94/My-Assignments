package week3.week3homeassignments;

public class OddIndexToUpperCase {

	    public static void main(String[] args) {
	       
	            String test = "changeme";
	            String modifiedString = changeOddIndexToUppercase(test);
	            System.out.println(modifiedString); // Output: "cHaNgEmE"
	        }
//Convert the given String to a character array.
	        public static String changeOddIndexToUppercase(String input) {
	            char[] chars = input.toCharArray();

	            //a loop to iterate through each character of the String (from end to start).
	            for (int i = chars.length - 1; i >= 0; i--) {
	                if (i % 2 != 0) { 
	                	// If the index is odd
	                    chars[i] = Character.toUpperCase(chars[i]);
	                }
	            }

	            return new String(chars);
	        }
	    
	    }


	    
/*
 * Assignment Details: Change the odd index of a given String to uppercase with
 * the input : String test = “changeme”; Requirements:
 * 
 * - Convert the given String to a character array. - Implement a loop to
 * iterate through each character of the String (from end to start). - Find the
 * odd index within the loop - Inside the loop, change the character to
 * uppercase only if the index is odd - Print the characters with the expected
 * output: cHaNgEmE
 */