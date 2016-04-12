import javax.swing.JOptionPane;

public class FruitsGUI {
	public static void main(String[]args){
	
		
		String applesStr = JOptionPane.showInputDialog(null,"How many apples do you want?");
		
		int apples = Integer.parseInt(applesStr);
		
		String orangesStr = JOptionPane.showInputDialog(null, "How many oranges do you want?");
		
		int oranges = Integer.parseInt(orangesStr);
		int sum = apples + oranges;
		
		JOptionPane.showMessageDialog(null,"The total amount of fruit you have is " + sum);
		System.exit(0);
	}
	
}