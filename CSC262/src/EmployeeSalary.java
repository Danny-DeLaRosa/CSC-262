import java.util.Scanner;
public class EmployeeSalary {

	public static void main(String[] args) {
		// Prompts and user input
		Scanner in = new Scanner(System.in);
		System.out.print("Employee first name: ");
		String fName = in.nextLine();
		System.out.print("Employee last name: ");
		String lName = in.nextLine();
		System.out.print("Employee salary(hourly): ");
		double salary = in.nextDouble();
		System.out.print("How many hours has " + fName + " worked in the past week? ");
		double hours = in.nextDouble();
		// variables for paycheck calculation
		final double OVER_TIME = 1.5;
		double payCheck;
		// conditional statement for calculation
		if(hours <= 40) {
			payCheck = salary * hours;
		}
		else {
			payCheck = (salary * hours) + (salary * OVER_TIME * (hours - 40));
		}
		// output
		System.out.print(fName + " " + lName + ": $");
		System.out.printf("%.2f", payCheck);
	}

}
