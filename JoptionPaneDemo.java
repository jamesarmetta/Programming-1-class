import javax.swing.JoptionPane;
public class JOptionPaneDemo
{
	public static void main(String[] args)
	{
		string appleString = 
			JOptionPane.showInputDialog ("Enter number of apples: ");
		int appleCount = Integer.parseInt (appleString);
		String orangeString =
			JOptionPane.showInputDialog ("Enter number of oranges: ");
		int orangeCount = Integer.parseInt (orangeString);
		int totalFruitCount = appleCount + orangeCount;
		JOptionPane.showMessageDialog (null, "the total number of fruit = " + totalFruitCount);
		
		System.exit (0);
	}
}