import java.util.Scanner;
import java.util.ArrayList;

public class Swapping {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        System.out.print("Enter a word: ");
	        String word = in.nextLine();

	        // Put characters into an ArrayList
	        ArrayList<Character> letters = new ArrayList<>();
	        for (int i = 0; i < word.length(); i++) {
	            letters.add(word.charAt(i));
	        }

	        // Repeat word.length() times
	        for (int count = 0; count < letters.size(); count++) {
	            // Pick a random position i (not the last position)
	            int i = (int) (Math.random() * (letters.size() - 1)); 
	            
	            // Pick a random position j > i
	            int j = i + 1 + (int) (Math.random() * (letters.size() - (i + 1)));

	            // Swap letters at positions i and j
	            char temp = letters.get(i);
	            letters.set(i, letters.get(j));
	            letters.set(j, temp);
	        }

	        // Convert ArrayList back to a String
	        StringBuilder permuted = new StringBuilder();
	        for (char c : letters) {
	            permuted.append(c);
	        }

	        System.out.println("Permuted word: " + permuted.toString());
	        in.close();
	
		// read a word

	}
}

