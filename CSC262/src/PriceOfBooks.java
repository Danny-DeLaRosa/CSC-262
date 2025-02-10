import java.util.Scanner;
public class PriceOfBooks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // User input
		// Price if book, sales tax, and shipping cost wont change (in this scenario)
		final double bookPrice = 7.25;
		final double salesTax = 0.085;
		final double shippingCost = 3.50;
		
		// user input for many books were purchased
		System.out.print("How many books did you purchase? ");
		int books = in.nextInt();
		
		// total price of order after tax and shipping
		double totalBeforeTaxShipping = books * bookPrice;
		double totalTax = (totalBeforeTaxShipping * salesTax);
		double totalShipping = (books * shippingCost);
		double totalAfterTaxShipping = totalBeforeTaxShipping + totalTax + totalShipping;
		
		// Price breakdown of order
		System.out.println("Your total for " + books + " books is: ");
		System.out.printf("Total before tax and shipping: $%.2f%n" , totalBeforeTaxShipping);
		System.out.printf("+ Taxes: $ %.2f%n" ,totalTax);
		System.out.printf("+ Shipping: $%.2f%n" ,totalShipping);
		System.out.printf("Total after tax and shipping: $%.2f%n" ,totalAfterTaxShipping);
	}

}
