import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>(List.of(
			    "Apple", "banana", "Cherry", "dog", "Elephant", "fox", "Grapes", "hippo", "Ice", "jaguar"
			));
		print_array_list(words);
	}
	
	public static void print_array_list(ArrayList<String> a) {
		if(a.size() > 1) {
			for(String e : a) 
				if(e != a.get(a.size() - 1)){
				System.out.print(e + ", ");
				}
				else {
					System.out.print(e);
			}
			System.out.println();
			
		}
	}

}
