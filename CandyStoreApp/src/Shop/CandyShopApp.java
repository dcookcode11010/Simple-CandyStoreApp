package Shop;

import java.util.Scanner;

public class CandyShopApp 
{
	public static void main(String[] args) 
	{
		 System.out.println("Please select a number 1-4"+"\n1-Chocolate \n2-Gum \n3-Taffy \n4-Lollipop");
		 Scanner item1 = new Scanner(System.in);
		 System.out.println("Select a number: ");
		 
		 int choice = item1.nextInt();
		 
		 Scanner count1 = new Scanner(System.in);
		 System.out.println("\nHow many will you like? ");
		 
		 int number = count1.nextInt();
		 
		 Register r1 = new Register(choice, number);
		 r1.displayValue();
		
	}
}
