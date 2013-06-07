import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelBackground extends JPanel
{
	public static final int MAX_VEHICLES = 2;
	
	private Image imgBackground;
	private JPanel pnlRoads[] = new PanelRoad[MAX_VEHICLES];
	private JButton btnStart;
	
	private Vehicle vehicles[][] = 
	{
		{new VehicleCar(), new VehicleCar()},
		{new VehicleCar(), new VehicleCar()}
	};
	
	public PanelBackground()
	{
		imgBackground = new ImageIcon("res/background.png").getImage();
		
		// Set properties
		setLayout(null);	// This enable free locating using setBounds or setLocation.
		
		// Create components
		for (int i=0 ; i<pnlRoads.length ; i++)
		{
			pnlRoads[i] = new PanelRoad(vehicles[i]);
			pnlRoads[i].setBounds(0, 32*9 + 32*4*i, PanelRoad.PANEL_WIDTH, PanelRoad.PANEL_HEIGHT);
			pnlRoads[i].setBackground(new Color(0, 0, 0, 0));	// last parameter is to transparent background.
		}
		
		btnStart = new ButtonStart(vehicles);
		btnStart.setBounds(32*13, 32*18, 32*6, 32*3);
		
		// Add components
		for (int i=0 ; i<pnlRoads.length ; i++)
		{
			add(pnlRoads[i]);
		}
		add(btnStart);
	}
	
	public void paintComponent(Graphics g)
	{
		// Draw background image
		g.drawImage(imgBackground, 0, 0, this);
	}
}
