import java.util.Scanner;
public class SplitDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // user input
		
		// user inputs for number between 1,000 and 999,999 
		System.out.print("Please enter number between 1,000 and 999,999: ");
		String number = in.next();
		int numberLength = number.length();
		
		if (numberLength == 5)
			System.out.println(number.substring(0, 1) + number.substring(2));
		else if(numberLength == 6)
			System.out.println(number.substring(0, 2) + number.substring(3));
		else if(numberLength == 7)
			System.out.println(number.substring(0, 3) + number.substring(4));
		else
			System.out.println("Error: number is not withing parameters (please include comma or make sure number is within range)");
	}

}
