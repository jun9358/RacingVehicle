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
	private JPanel pnlRoads;
	private JButton btnStart;
	
	private Vehicle vehicles[] = new Vehicle[MAX_VEHICLES];
	
	public PanelBackground()
	{
		imgBackground = new ImageIcon("res/background.png").getImage();
		
		// Set properties
		setLayout(null);	// This enable free locating using setBounds or setLocation.
		
		// Create components	
		pnlRoads = new PanelRoads(vehicles);
		pnlRoads.setBounds(0, 32*9, PanelRoads.PANEL_WIDTH, PanelRoads.PANEL_HEIGHT);
		pnlRoads.setBackground(new Color(0, 0, 0, 0));	// last parameter is to transparent background.
		
		btnStart = new ButtonStart(vehicles);
		btnStart.setBounds(32*13, 32*18, 32*6, 32*3);
		
		// Add components
		add(pnlRoads);
		add(btnStart);
	}
	
	public void paintComponent(Graphics g)
	{
		// Draw background image
		g.drawImage(imgBackground, 0, 0, this);
	}
}
