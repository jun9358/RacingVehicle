import javax.swing.JFrame;


public class FrameRacingVehicle extends JFrame
{
	private static final int FRAME_INNER_WIDTH = 1024;
	private static final int FRAME_INNER_HEIGHT = 768;
	
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
	}
}
