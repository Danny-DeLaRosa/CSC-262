import java.util.Scanner;
public class Methods {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Test each method
		System.out.print("Enter an integer value: ");
        int testValue = in.nextInt();
        System.out.println("Test value: " + testValue);
        System.out.println("First digit: " + firstDigit(testValue));
        System.out.println("Last digit: " + lastDigit(testValue));
        System.out.println("Number of digits: " + countDigits(testValue));

        // You can test other values here
        System.out.print("Enter an diferent integer value: ");
        int anotherValue = in.nextInt();
        System.out.println("\nTest value: " + anotherValue);
        System.out.println("First digit: " + firstDigit(anotherValue));
        System.out.println("Last digit: " + lastDigit(anotherValue));
        System.out.println("Number of digits: " + countDigits(anotherValue));

	}



public static int firstDigit(int n) {
    n = Math.abs(n);           // Handle negative numbers
    while (n >= 10) {
        n /= 10;               // Strip off the last digit until only one remains
    }
    return n;
}

public static int lastDigit(int n) {
    n = Math.abs(n);           // Handle negative numbers
    return n % 10;             // The remainder when divided by 10 is the last digit
}

public static int countDigits(int n) {
    // Special case for 0
    if (n == 0) {
        return 1;
    }
    
    n = Math.abs(n);           // Handle negative numbers
    int count = 0;
    while (n > 0) {
        n /= 10;
        count++;
    }
    return count;
}
}