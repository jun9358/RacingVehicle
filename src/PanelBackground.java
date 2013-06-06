import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class PanelBackground extends JPanel
{
	private Image imgBackground;
	private JPanel pnlRoads;
	
	public PanelBackground()
	{
		imgBackground = new ImageIcon("res/background.png").getImage();
		
		// Set properties
		setLayout(null);
		
		// Create components
		pnlRoads = new PanelRoads();
		pnlRoads.setBounds(0, 32*8, PanelRoads.PANEL_WIDTH, PanelRoads.PANEL_HEIGHT);
		pnlRoads.setBackground(new Color(0, 0, 0, 0));
		
		// Add components
		add(pnlRoads);
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawImage(imgBackground, 0, 0, this);
	}
}
