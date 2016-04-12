
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
 
public class comp extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
 
        Ellipse2D.Double blueRing = new Ellipse2D.Double(30,90,100,100);
        g2.setColor(Color.BLUE);
        g2.draw(blueRing);
 
        Ellipse2D.Double blackRing = new Ellipse2D.Double(100,90,100,100);
        g2.setColor(Color.BLACK);
        g2.draw(blackRing);
 
        Ellipse2D.Double redRing = new Ellipse2D.Double(180,90,100,100);
        g2.setColor(Color.RED);
        g2.draw(redRing);
 
 
        Ellipse2D.Double greenRing = new Ellipse2D.Double(70,140,100,100);
        g2.setColor(Color.yellow);
        g2.draw(greenRing);
 
        Ellipse2D.Double yellowRing = new Ellipse2D.Double(140,140,100,100);
        g2.setColor(Color.green);
        g2.draw(yellowRing);
 
    }
}