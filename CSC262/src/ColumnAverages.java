import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ColumnAverages {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the filename: ");
        String filename = userInput.nextLine();
        
        File inputFile = new File(filename);
        
        try (Scanner fileScanner = new Scanner(inputFile)) {
            double sumCol1 = 0, sumCol2 = 0;
            int count = 0;

            while (fileScanner.hasNextDouble()) {
                double num1 = fileScanner.nextDouble();
                double num2 = fileScanner.nextDouble();
                
                sumCol1 += num1;
                sumCol2 += num2;
                count++;
            }

            if (count > 0) {
                System.out.printf("Average of Column 1: %.6f%n", sumCol1 / count);
                System.out.printf("Average of Column 2: %.6f%n", sumCol2 / count);
            } else {
                System.out.println("No valid data found in the file.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } finally {
            userInput.close();
        }

	}

}
