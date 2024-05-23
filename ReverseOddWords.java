package week3.homeassignments;

public class ReverseOddWords {

	public static void main(String[] args) {
		String input = "I am a software tester";
		//output = I ma a erawtfos tester
		// convert the given input to charArray
		char[] ch = input.toCharArray();
		// iterate through the characters in reverse
		for (int i = ch.length-1; i>=0 ; i--) {
			// print the output
			System.out.print(ch[i]);	// TODO Auto-generated method stub

	}

}
}

/*
 * Assignment Details: Reverse the odd position words from a String with the
 * input: String test = "I am a software tester"; Expected output: “I ma a
 * erawtfos tester”
 * 
 * Assignment Requirements:
 * 
 * - Split the words and have it in an array - Traverse through each word using
 * loop - Find the odd index within the loop - Convert the String array into a
 * character array - Print the even position words using another loop
 * 
 * Hints to Solve: - Print the even position words in reverse order using nested
 * loop - Convert words to character array if the position is odd else print the
 * word as it is (concatenate space at the end).
 */