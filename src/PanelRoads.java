import javax.swing.JComponent;
import javax.swing.JPanel;


public class PanelRoads extends JPanel
{
	public static final int PANEL_WIDTH = 1024;
	public static final int PANEL_HEIGHT = 352;
	
	private Vehicle vehicle1;
	private Vehicle vehicle2;
	
	public PanelRoads()
	{
		// Set properties
		setLayout(null);
		
		// Create component
		vehicle1 = new VehicleCar();
		vehicle1.setBounds(0, 32, 32, 32);
		
		vehicle2 = new VehicleCar();
		vehicle2.setBounds(0, 32*5, 32, 32);
		
		// Add component
		add((JComponent)vehicle1);
		add((JComponent)vehicle2);
	}
}