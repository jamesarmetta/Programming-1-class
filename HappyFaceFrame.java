import javax.swing.JFrame;
import java.awt.Graphics;

public class HappyFaceFrame extends JFrame {
	
	public void paint(Graphics canvas) {
		
		super.paint(canvas);
		canvas.drawOval(100, 50, 200, 200);
		canvas.fillOval(155, 100, 10, 20);
		canvas.fillOval(230, 100, 10, 20);
		canvas.drawArc(150, 160, 100, 50, 180, 180);
	}
	
	public HappyFaceFrame(String frameTitle) {
		super(frameTitle);
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String [] args) {
		HappyFaceFrame myFrame = new HappyFaceFrame ("My very first JFrame.");
		myFrame.setVisible(true);
	}
}

