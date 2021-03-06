import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;


public class ComboVehicle extends JComboBox implements ActionListener
{
	private static final int COMBOBOX_WIDTH = 32*3;
	private static final int COMBOBOX_HEIGHT = 32;
	
	public ComboVehicle()
	{
		// Set size
		setSize(COMBOBOX_WIDTH, COMBOBOX_HEIGHT);
		
		// Set listener
		this.addActionListener(this);
	}
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		// If combobox folded, some background removed. So repaint that
		this.getRootPane().repaint();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (this.getParent() != null)	// In loading, this.getParent() is not set.
		{
			// Change vehicle
			((PanelRoad)this.getParent()).refreshVehicle();
		}
	}
}
