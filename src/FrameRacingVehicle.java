import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class FrameRacingVehicle extends JFrame
{	
	private static final int FRAME_INNER_WIDTH = 1024;
	private static final int FRAME_INNER_HEIGHT = 768;
	
	private JPanel pnlBackground;
	private JPanel pnlRoads;
	
	FrameRacingVehicle()
	{
		// This code can be using getInsets() method to get border size
		setVisible(true);
		setVisible(false);
		
		// Set properties
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize
		(
			FRAME_INNER_WIDTH + getInsets().left + getInsets().right,
			FRAME_INNER_HEIGHT + getInsets().top + getInsets().bottom
		);
		setLayout(null);
		
		// Create components
		pnlBackground = new PanelBackground();
		pnlBackground.setBounds(0, 0, FRAME_INNER_WIDTH, FRAME_INNER_HEIGHT);
		
		pnlRoads = new PanelRoads();
		pnlRoads.setBounds(0, 32*8, PanelRoads.PANEL_WIDTH, PanelRoads.PANEL_HEIGHT);
		pnlRoads.setBackground(new Color(0, 0, 0, 0));
		
		// Add components
		add(pnlRoads);
		add(pnlBackground);
	}
}
