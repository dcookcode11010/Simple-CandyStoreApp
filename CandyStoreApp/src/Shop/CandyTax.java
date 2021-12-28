package Shop;

public interface CandyTax 
{
	default double Ctax()
	{
		return 0.06;
	}
}
