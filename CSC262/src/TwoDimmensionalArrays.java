import java.util.Arrays;
public class TwoDimmensionalArrays {

	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		
		 System.out.println("Original Matrix:");
	        printMatrix(matrix);
	        
	        swapRows(matrix, 0, 2);

	        System.out.println("\nMatrix after swapping row 0 and row 2:");
	        printMatrix(matrix);
	 }
	
	public static void swapRows(int[][] array, int row1, int row2) {
        int[] temp = array[row1]; // Store row1 temporarily
        array[row1] = array[row2]; // Assign row2 to row1
        array[row2] = temp; // Assign temp (original row1) to row2
    }
	
	 public static void printMatrix(int[][] array) {
	        for (int[] row : array) {
	            System.out.println(Arrays.toString(row));
	        }
	}

}


