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
		System.out.println("You entered " + count(numberList) + " numbers");
		System.out.printf("The average of numbers is %.2f%n" , average(numberList));
		System.out.printf("The smallest number is %.2f%n" , minimum(numberList));
		System.out.printf("The largest number is %.2f%n" , maximum(numberList));		

	}
	public static int count(ArrayList<Double> a) {
		int count = 0;
		for(double e : a) {
			count++;
		}
		return count;
	}
	public static double average(ArrayList<Double> a) {
		double sum = 0;
		for(double e:a) {
			sum += e;
		}
		return sum /count(a);
	}
	public static double minimum(ArrayList<Double> a) {
		double minValue = a.get(0);
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i) < minValue ) {
				minValue = a.get(i);
			}
		}
		return minValue;
	}
	public static double maximum(ArrayList<Double> a) {
		double maxValue = 0;
		for(double e:a) {
			if(e > maxValue) {
				maxValue = e;
			}
		}
		return maxValue;
	}
}
