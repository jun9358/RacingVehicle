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
		
		// Set properties
		setLayout(null);	// This enable free locating using setBounds or setLocation.
		
		// Create component
		cmbVehicle = new ComboVehicle();
		for (int i=0 ; i<vehicles.length ; i++)
		{
			cmbVehicle.addItem(vehicles[i].getName());
		}
		cmbVehicle.setBounds(0, 32*3, 32*3, 32);
		
		// Add component
		add(cmbVehicle);
		
		refreshVehicle();
	}
	
	public void refreshVehicle()
	{
		if (nowVehicle != null)
		{
			this.remove((JComponent)nowVehicle);
		}
		
		Vehicle newVehicle = vehicles[cmbVehicle.getSelectedIndex()];
		this.add((JComponent)newVehicle);
		newVehicle.setBounds(0, 32, 32, 32);
		nowVehicle = newVehicle;
		
		this.revalidate();
	}
}