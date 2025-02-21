
public class Swapping {

	public static void main(String[] args) {
		// read a word
		String word = "Programming";
		double rand = Math.random() * (word.length() - 2);
		rand = Math.ceil(rand);
		System.out.println(rand);

	}
	public static String swapLetter(String a) {
		System.out.println(a);
		int rand = (int)Math.ceil(Math.random()) * a.length() - 1;
		return a;
	}

}
