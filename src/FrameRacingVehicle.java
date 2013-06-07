import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class FrameRacingVehicle extends JFrame
{	
	private static final int FRAME_INNER_WIDTH = 1024;
	private static final int FRAME_INNER_HEIGHT = 640;
	
	private JPanel pnlBackground;
	
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
		setLayout(null);	// This enable free locating using setBounds or setLocation.
		
		// Create components
		pnlBackground = new PanelBackground();
		pnlBackground.setBounds(0, 0, FRAME_INNER_WIDTH, FRAME_INNER_HEIGHT);
		
		// Add components
		add(pnlBackground);
	}
}
