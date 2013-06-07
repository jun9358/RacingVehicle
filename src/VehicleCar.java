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
		setSize(VEHICLE_WIDTH, VEHICLE_HEIGHT);
	}
	
	public String getName()
	{
		return vehicleName;
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawRect(0, 0, 31, 31);
	}
	
	public void move(int direction)
	{
		this.setLocation
		(
			this.getLocation().x + dir[direction].x,
			this.getLocation().y + dir[direction].y
		);
		this.getRootPane().repaint();
	}
	
	public Rectangle getBounds()
	{
		return super.getBounds();
	}
}
