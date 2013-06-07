import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;


public class PanelRoads extends JPanel
{
	public static final int PANEL_WIDTH = 1024;
	public static final int PANEL_HEIGHT = 352;
	public static final int MAX_VEHICLES = 2;
	
	private Vehicle vehicles[];
	private ComboVehicle cmbVehicle[] = new ComboVehicle[MAX_VEHICLES];
	
	public PanelRoads(Vehicle _vehicles[])
	{
		vehicles = _vehicles;
		
		// Set properties
		setLayout(null);	// This enable free locating using setBounds or setLocation.
		
		// Create component
		vehicles[0] = new VehicleCar();
		vehicles[0].setBounds(0, 32, 32, 32);
		
		vehicles[1] = new VehicleCar();
		vehicles[1].setBounds(0, 32*5, 32, 32);
		
		cmbVehicle[0] = new ComboVehicle();
		cmbVehicle[0].setBounds(0, 32*3, 32*3, 32);
		
		cmbVehicle[1] = new ComboVehicle();
		cmbVehicle[1].setBounds(0, 32*7, 32*3, 32);
		
		// Add component
		for (int i=0 ; i<vehicles.length ; i++)
		{
			add((JComponent)vehicles[i]);
			add(cmbVehicle[i]);
		}
	}
}