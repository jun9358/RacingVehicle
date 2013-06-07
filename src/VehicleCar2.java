import java.awt.Graphics;

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
		g.drawOval(0, 0, 31, 31);
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
}
