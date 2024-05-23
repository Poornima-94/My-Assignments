package week3.homeassignments;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String text = "We learn Java basics as part of java sessions in java week1";
		        String result = removeDuplicates(text);
		        System.out.println(result);
		    }

		    public static String removeDuplicates(String text) {
		        // Split the input string into words
		        String[] words = text.split("\\s+");

		        // Set to keep track of unique words
		        Set<String> uniqueWords = new HashSet<>();

		        // StringBuilder to construct the result
		        StringBuilder resultBuilder = new StringBuilder();

		        // Iterate over words
		        for (String word : words) {
		            // Convert word to lowercase for case-insensitive comparison
		            String lowercaseWord = word.toLowerCase();

		            // Add word to result if it's the first occurrence
		            if (!uniqueWords.contains(lowercaseWord)) {
		                resultBuilder.append(word).append(" ");
		                uniqueWords.add(lowercaseWord);
		            }
		        }

		        // Convert StringBuilder to String and trim any trailing whitespace
		        return resultBuilder.toString().trim();
		    }
		
	}

