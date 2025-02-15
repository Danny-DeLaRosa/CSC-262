import java.util.Scanner;
public class SumAndProduct {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sumOfNums = 0;
		int prodOfNums = 1;
		
		for( int i = 0; i < 5; i++)
		{
			System.out.print("Enter a number: ");
			int number = in.nextInt();
			
			sumOfNums += number;
			prodOfNums *= number;
			
		}
		System.out.println("Sum of numbers: " + sumOfNums);
		System.out.println("Profduct of numbers: " + prodOfNums);
		
		
		
		
	}

}
