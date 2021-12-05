import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Color;

public class PicturePanel extends JPanel implements MouseListener, MouseMotionListener{
	public static void setPicture() {
		
	}
	private String message;
	private int msgX, msgY;
	public PicturePanel() {
		message = String.format("(x=0, y=0"); // Initially displays 0,0 as coordinates
		setPreferredSize(new Dimension(200,200));
		addMouseListener(this);
		addMouseMotionListener(this);
		msgX = 10;
		msgY = 10;
	}
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // background and boundaries
        g.drawString(message,msgX,msgY);
    }
	 public void mouseClicked(MouseEvent e) { // Displays coordinated when clicked
	        message = String.format("(x=%d, y=%d)", e.getX(),e.getY());
	        msgX = e.getX();
	        msgY = e.getY();
	        repaint(); // Changes its position
	 }
	    public void mouseMoved(MouseEvent e) {
	    	message = String.format("(x=%d, y=%d)", e.getX(),e.getY());
	        repaint(); // Changes its position
	    }
		public void mouseDragged(MouseEvent e) {
			message = String.format("(x=%d, y=%d)", e.getX(),e.getY());	
			 repaint(); // Changes its position
		}
		public void mousePressed(MouseEvent e) {
	        message = String.format("(x=%d, y=%d)", e.getX(),e.getY());
	        msgX = e.getX();
	        msgY = e.getY();
	        repaint(); // Changes its position
		}
		public void mouseReleased(MouseEvent e) {
			 message = String.format("(x=%d, y=%d)", e.getX(),e.getY());
			 repaint(); // Changes its position
			
		}
		public void mouseEntered(MouseEvent e) {
			 message = String.format("(x=%d, y=%d)", e.getX(),e.getY());
			 repaint(); // Changes its position	
		}
		public void mouseExited(MouseEvent e) {
			 message = String.format("(x=%d, y=%d)", e.getX(),e.getY());
			 repaint(); // Changes its position
			
		}
}
