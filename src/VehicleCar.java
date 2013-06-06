import java.awt.Graphics;

import javax.swing.JComponent;


public class VehicleCar extends JComponent implements Vehicle
{
	public VehicleCar()
	{
		
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawRect(0, 0, 31, 31);
	}
}
