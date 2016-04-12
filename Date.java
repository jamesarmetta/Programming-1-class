import javax.swing.JOptionPane;

public class Date

{

	public static void main(String [] args)
	{ 

		String month, day, year;
		
		
		month = JOptionPane.showInputDialog
		("Please input the month");
		day = JOptionPane.showInputDialog
		("Please input the day");
		year = JOptionPane.showInputDialog
		("Please input the year");



		JOptionPane.showMessageDialog(null, month + "/" + day + "/" + year);
		JOptionPane.showMessageDialog(null, day + "." + month + "." + year);
		
		
	}
}