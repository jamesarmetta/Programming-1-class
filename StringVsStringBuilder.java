public class StringVsStringBuilder
{
	public static void stringDemo()
	{
		String s1 = "Hello";
		
		System.out.println("s1=[" + s1 + "] before calling substring ()");
		String s2 = s1.substring(0, 3);
		
		System.out.println("s1=[" + s1 + "] after calling substring ()");
		System.out.println("s2=[" + s2 + "]");
	}
	
	public static void stringBuilderDemo()
	{
		StringBuilder sb = new StringBuilder("hello");
	System.out.println("sb = [ " + sb.toString() +" ] before calling substring ()");
	
	sb.append ("world");
	System.out.println("sb = [ " + sb.toString() +" ] after calling substring () ");
	
	}
	
	
	
	public static void main(String[] args)
	{
		stringDemo();
		System.out.println("===============================================");
		stringBuilderDemo();
		
	}
} 