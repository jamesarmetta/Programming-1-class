import javax.swing.JFram;
import java.awt.Graphics;

public class HappyFace extends JFrame
{
	public void paint(Graphics canvas)
	{
	super.paint(canvas);
	canvas.drawRoundRect(100, 50, 200, 200, 50, 50);
	canvas.fillOval(155, 100, 10, 20); 
	canvas.fillOval(230, 100, 10, 20);
	canvas.drawArc(150, 160, 100, 50, 180, 180);
	}
	
	public HappyFaceFrame(String frameTitle)
	{
		super(frameTitle);
		
		setSize(600, 400);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main (String[] args)
	{
	
		HappyFaceFrame myFrame = new HappyFaceFrame ("my first JFrame");
		myFrame.setVisible(true);
	}
}