import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MaxMinAvg {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please input a set of positive whole and decimal numbers. Enter -1 to quit: ");
		double number;
		ArrayList<Double> numberList = new ArrayList<>(List.of());
		do {
		number = in.nextDouble();
		if(number > 0)
			numberList.add(number);
		}while(number > 0);
		
		System.out.println(numberList);
		System.out.println(count(numberList));
		

	}
	public static int count(ArrayList<Double> a) {
		int count = 0;
		for(double e : a) {
			count++;
		}
		
		return count;
	}

}
