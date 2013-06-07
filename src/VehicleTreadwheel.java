import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;


public class VehicleTreadwheel extends JComponent implements Vehicle
{
	private static final String vehicleName = "TreadWheel";
	private static final int VEHICLE_WIDTH = 96;
	private static final int VEHICLE_HEIGHT = 96;
	
	private int speed;
	
	public VehicleTreadwheel(int _speed)
	{
		speed = _speed;
		
		// Set size
		setSize(VEHICLE_WIDTH, VEHICLE_HEIGHT);
	}
	
	public String getName()
	{
		return vehicleName;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		// Draw vehicle
		g2.setColor(new Color(0x46, 0x41, 0xD9));
		g2.setStroke(new BasicStroke(2));
		g2.drawOval(16, 16, 64, 64);	// Wheel
		
		g2.setStroke(new BasicStroke(1));
		g2.setColor(new Color(247, 239, 255));
		g2.fillOval(46, 36, 20, 20);	// Head		
		
		g2.setColor(Color.BLACK);
		g2.drawLine(56, 39, 66, 44);	// Eyebrow
		g2.drawOval(60, 43, 3, 3);		// Eye
		g2.drawLine(52, 55, 35, 64);	// Body
		g2.drawLine(35, 64, 30, 72);	// Leg1
		g2.drawLine(35, 64, 38, 76);	// Leg2
		g2.drawLine(48, 57, 65, 73);	// Arm1
		g2.drawLine(48, 57, 69, 69);	// Arm2
	}
	
	public void move(int direction)
	{
		this.setLocation
		(
			this.getLocation().x + dir[direction].x*speed,
			this.getLocation().y + dir[direction].y*speed
		);
		
		// Afterimage is remained, so repaint that part.
		this.getRootPane().repaint();
	}
	
	public Rectangle getBounds()
	{
		return super.getBounds();
	}
}
