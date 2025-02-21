
public class Test {

	public static void main(String[] args) {
		        int rows = 10; // Number of rows for the patterns

		        // Pattern (a)
		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print('*');
		            }
		            System.out.println();
		        }
		        System.out.println(); // Space between patterns

		        // Pattern (b)
		        for (int i = rows; i >= 1; i--) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print('*');
		            }
		            System.out.println();
		        }
		        System.out.println(); // Space between patterns

		        // Pattern (c)
		        for (int i = rows; i >= 1; i--) {
		            for (int j = 1; j <= rows - i; j++) {
		                System.out.print(' '); // Print leading spaces
		            }
		            for (int k = 1; k <= i; k++) {
		                System.out.print('*');
		            }
		            System.out.println();
		        }
		        System.out.println(); // Space between patterns

		        // Pattern (d)
		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= rows - i; j++) {
		                System.out.print(' '); // Print leading spaces
		            }
		            for (int k = 1; k <= i; k++) {
		                System.out.print('*');
		            }
		            System.out.println();
		        }
		    }
	}
