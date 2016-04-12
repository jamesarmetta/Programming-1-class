import java.util.Scanner;
public class VendingMach
{
	public static void main(String[] args)
	{int CandyBar;
	 int Coupons;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("how many candy bars did you buy");
		CandyBar= keyboard.nextInt();
	int AdditionalCandyBars = CandyBar/6;
		
	
	int TotalCandyBars = AdditionalCandyBars + CandyBar;
	int extra = CandyBar % 6;
	System.out.println("You get " + TotalCandyBars + " bars") ;
	System.out.println("With " + extra + " remaining coupons");
	
}
}