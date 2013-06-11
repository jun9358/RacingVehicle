import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.JPanel;


public class VehicleGoogle extends JComponent implements Vehicle
{
	private static final String vehicleName = "Google";
	private static final int VEHICLE_WIDTH = 32;
	private static final int VEHICLE_HEIGHT = 80;
	
	private int speed;
	private boolean isSkill;
	
	public VehicleGoogle(int _speed)
	{
		speed = _speed;
		
		// Set size
		setSize(VEHICLE_WIDTH, VEHICLE_HEIGHT);
	}
	
	public String getName()
	{
		return vehicleName;
	}
	
	public void setSpeed(int _speed)
	{
		speed = _speed;
	}

	public void initVehicle()
	{
		setLocation(32*3 - VEHICLE_WIDTH, (32*3 - VEHICLE_HEIGHT) / 2);
		speed = 0;
	}
	
	public void paintComponent(Graphics g)
	{
		// Draw vehicle
		g.setColor(new Color(247, 239, 255));
		g.fillOval(6, 0, 20, 20);			// Head
		
		g.setColor(new Color(0x8C, 0x8C, 0x8C));
		g.fillOval(10, 32+20, 12, 12);		// Wheel
		
		g.setColor(new Color(0, 0, 0));
		g.drawLine(16, 3, 26, 8);			// Eyebrow
		g.drawOval(20, 7, 3, 3);			// Eye
		g.drawLine(6+10, 20, 16, 48);		// Body
		g.drawLine(16, 48, 14, 32+20);		// Leg1
		g.drawLine(16, 48, 18, 32+26);		// Leg2
		g.drawLine(16, 32, 24-4, 32-3);		// Arm1
		g.drawLine(16, 32, 24+4, 32+3);		// Arm2
		
		g.setColor(Color.GREEN);
		g.drawLine(16, 32+20+6, 24, 32);	// Vehicle body
		g.drawLine(24-8, 32-5, 24+8, 32+5);	// Handle
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
	
	public boolean getIsSkill()
	{
		return isSkill;
	}
	
	public void enableSkill()
	{
		isSkill = true;
	}
	
	public void disableSkill()
	{
		isSkill = false;
	}
}
