import java.util.Scanner;

public class SupermarketCoupon {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		// User input
		System.out.print("Please enter price of groceries: $");
		double price = in.nextDouble();
		
		// conditional statements for coupon price
			if (price >= 210)
			{
				price *= 0.14;
				System.out.printf("You are eligible for a dicount coupon of: $%.2f", price);
			}
			else if(price >= 150)
			{
				price *= 0.12;
				System.out.printf("You are eligible for a dicount coupon of: $%.2f", price);
			}
			else if(price >= 60)
			{
				price *= 0.12;
				System.out.printf("You are eligible for a dicount coupon of: $%.2f", price);
			}
			else if(price >= 10)
			{
				price *= 0.12;
				System.out.printf("You are eligible for a dicount coupon of: $%.2f", price);
			}
			else
			{
				System.out.println("Youre not eligle for a coupon broke boy");
			}		
	}

}
