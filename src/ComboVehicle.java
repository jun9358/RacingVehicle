import java.awt.Graphics;

import javax.swing.JComboBox;


public class ComboVehicle extends JComboBox
{
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		this.getRootPane().repaint();
	}
}
