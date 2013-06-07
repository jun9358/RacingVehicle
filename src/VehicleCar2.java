import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JComponent;


public class VehicleCar2 extends JComponent implements Vehicle
{
	private static final String vehicleName = "Car2";
	
	public VehicleCar2()
	{
		
	}
	
	public String getName()
	{
		return vehicleName;
	}
	
	public void paintComponent(Graphics g)
	{
		// Draw vehicle
		g.drawOval(0, 0, 31, 31);
	}
	
	public void move(int direction)
	{
		this.setLocation
		(
			this.getLocation().x + dir[direction].x,
			this.getLocation().y + dir[direction].y
		);
		
		// Afterimage is remained, so repaint that part.
		this.getRootPane().repaint();
	}
	
	public Rectangle getBounds()
	{
		return super.getBounds();
	}
}
