import javax.swing.JComponent;
import javax.swing.JPanel;


public class PanelRoads extends JPanel
{
	public static final int PANEL_WIDTH = 1024;
	public static final int PANEL_HEIGHT = 352;
	public static final int MAX_VEHICLES = 2;
	
	private Vehicle vehicles[] = new Vehicle[MAX_VEHICLES];
		
	public PanelRoads()
	{
		// Set properties
		setLayout(null);
		
		// Create component
		vehicles[0] = new VehicleCar();
		vehicles[0].setBounds(0, 32, 32, 32);
		
		vehicles[1] = new VehicleCar();
		vehicles[1].setBounds(0, 32*5, 32, 32);
		
		// Add component
		for (int i=0 ; i<vehicles.length ; i++)
		{
			add((JComponent)vehicles[i]);
		}
	}
}