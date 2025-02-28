import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>(List.of(
			    "Apple", "banana", "Cherry", "dog", "Elephant", "fox", "Grapes", "hippo", "Ice", "jaguar"
			));
		System.out.print("Original: "); print_array_list(words);
		System.out.print("\nModified: "); move_uppercase_front(words);
	}
	
	public static void print_array_list(ArrayList<String> a) {
		  for (int i = 0; i < a.size(); i++) {
		        System.out.print(a.get(i));
		        if (i < a.size() - 1) {
		            System.out.print(", ");
		        }
		    }
		    System.out.println();
		}
	
	public static void move_uppercase_front(ArrayList<String> a) {
		ArrayList<String> uppercase = new ArrayList<>();
		ArrayList<String> lowercase = new ArrayList<>();
		
		for(int i = 0; i < a.size(); i++) {
			String str = a.get(i);
			Character firstChar = str.charAt(0);
			if(Character.isUpperCase(firstChar)) {
				uppercase.add(str);
			}
			else {
				lowercase.add(str);
			}
		}
		a.clear();
		a.addAll(uppercase);
		a.addAll(lowercase);
		print_array_list(a);
	}

}
