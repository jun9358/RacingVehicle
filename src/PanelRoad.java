import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;


public class PanelRoad extends JPanel
{
	public static final int PANEL_WIDTH = 1024;
	public static final int PANEL_HEIGHT = 128;
	public static final int MAX_VEHICLES = 2;
	
	private Vehicle vehicles[];
	private Vehicle nowVehicle;
	private ComboVehicle cmbVehicle;
	
	public PanelRoad(Vehicle _vehicles[])
	{
		vehicles = _vehicles;
		
		// Set size
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		
		// Set properties
		setLayout(null);	// This enable free locating using setBounds or setLocation.
		
		// Create component
		cmbVehicle = new ComboVehicle();
		for (int i=0 ; i<vehicles.length ; i++)
		{
			cmbVehicle.addItem(vehicles[i].getName());
		}
		cmbVehicle.setLocation(0, 32*3);
		
		// Add component
		add(cmbVehicle);
		
		// Set default vehicle
		refreshVehicle();
	}
	
	public int getSelectedVehicleIndex()
	{
		return cmbVehicle.getSelectedIndex();
	}
	
	public void refreshVehicle()
	{
		if (nowVehicle != null)	// In first, nowVehicle is null.
		{
			// Remove existing vehicle
			this.remove((JComponent)nowVehicle);
		}
		
		// Add new vehicle
		Vehicle newVehicle = vehicles[cmbVehicle.getSelectedIndex()];
		this.add((JComponent)newVehicle);
		newVehicle.setLocation(32*3 - newVehicle.getBounds().width, 0);
		
		// Set nowVehicle to newVehicle
		nowVehicle = newVehicle;
		
		// Reload component
		this.revalidate();
	}
	
	public void hideControlComponents()
	{
		cmbVehicle.setVisible(false);
	}
	
	public void showControlComponents()
	{
		cmbVehicle.setVisible(true);
	}
}