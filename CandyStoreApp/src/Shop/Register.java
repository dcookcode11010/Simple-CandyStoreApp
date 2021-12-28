package Shop;

public class Register implements CandyTax
{
	int item;
	int count;
	String name;
	double cost;
	double tax;
	double balance;

		public Register(int item, int count) 
		{
			this.item = item;
			this.count = count;
			
			this.tax = Ctax();
			this.cost = price();
			this.name = CandyName();
			this.balance = Totalbalance();
		}
		public double Totalbalance()
		{
			return balance = (tax * count) + (cost * count);
		}
		void displayValue()
		{
			System.out.println("Candy name: "+ name +"\nCandy cost: "+ cost);
			System.out.println("Total: "+ balance);
		}
		public double price()
		{
			if (count == 1)
			{
				return 1.75;
			}
			else if (count == 2)
			{
				return .25;
			}
			else if (count == 3)
			{
				return 1.00;
			}
			else if (count == 4)
			{
				return .50;
			}
			return 0;
		}
		public String CandyName()
		{
			{
				if (item == 1)
				{
					return "Chocolate";
				}
				else if (item == 2)
				{
					return "Gum";
				}
				else if (item == 3)
				{
					return "Taffy";
				}
				else if (item == 4)
				{
					return "Lollipop";
				}
				return " ";
			}
		}
}
