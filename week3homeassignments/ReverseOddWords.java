package week3.week3homeassignments;

public class ReverseOddWords {
    public static void main(String[] args) {
        String test = "I am a software tester";
        String reversedString = reverseOddPositionWords(test);
        System.out.println(reversedString); // Output: I ma a erawtfos tester
    }

    public static String reverseOddPositionWords(String input) {
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) { // If the index is odd
                result.append(reverseWord(words[i])).append(" ");
            } else {
                result.append(words[i]).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
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