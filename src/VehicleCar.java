import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JComponent;


public class VehicleCar extends JComponent implements Vehicle
{
	private static final String vehicleName = "Car";
	private static final int VEHICLE_WIDTH = 32;
	private static final int VEHICLE_HEIGHT = 32;
	
	public VehicleCar()
	{
		// Set size
		setSize(VEHICLE_WIDTH, VEHICLE_HEIGHT);
	}
	
	public String getName()
	{
		return vehicleName;
	}
	
	public void paintComponent(Graphics g)
	{
		// Draw vehicle
		g.drawRect(0, 0, 31, 31);
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
