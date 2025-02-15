import java.util.Scanner;
public class SumOfOdds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		System.out.println("Input integer: ");
		int input = in.nextInt();
		
		int sumOfOdds = 0;
		while(input > 0)
		{
			int lastDigit = input % 10;
			if(lastDigit % 2 == 1)
			{
				sumOfOdds += lastDigit;
			}
			input = input / 10;
			
		}
		System.out.println("Sum of odd number: " + sumOfOdds);
	}

}
