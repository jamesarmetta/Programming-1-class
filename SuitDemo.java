public class SuitDemo
{
	public static void main( String [] args)
	{
		Suit[] values = Suit.values();
		
		int size = values.length;
		
		for (int i = 0; i < size; i++)
		{
			System.out.println(values[i]);
		}
		
		System.out.println();
		
		//for each statment
		for ( Suit s : values )
		{
			System.out.println(s);
		}
		
		//switch statment
		//1, 2, 3, ... 7 
		
		// need to fix
		int weekday = 4;
		switch( weekday )
		{
			case Sunday:
				System.out.println("Sunday");
				break;
			case Monday:
				System.out.println("Monday");
				break;
			case Tuesday:
				System.out.println("Tuesday");
				break;
			case Wednesday:
				System.out.println("Wednesday");
				break;
			case Thursday:
				System.out.println("Thursday");
				break;
			case Friday:
				System.out.println("Friday");
				break;
			case Saturday:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Error!");
				break;
		}
		
	}
}