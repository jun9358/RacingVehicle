import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class PanelBackground extends JPanel
{
	public static final int MAX_VEHICLES = 2;
	
	private Image imgBackground;
	private PanelRoad pnlRoads[] = new PanelRoad[MAX_VEHICLES];
	private JButton btnStart;
	
	private Timer tmrMover;
	
	private Vehicle vehicles[][] = 
	{
		{new VehicleCar(), new VehicleCar2()},
		{new VehicleCar(), new VehicleCar2()}
	};
	
	public PanelBackground()
	{
		imgBackground = new ImageIcon("res/background.png").getImage();
		
		// Set properties
		setLayout(null);	// This enable free locating using setBounds or setLocation.
		
		// Create components
		for (int i=0 ; i<pnlRoads.length ; i++)
		{
			pnlRoads[i] = new PanelRoad(vehicles[i]);
			pnlRoads[i].setBounds(0, 32*9 + 32*4*i, PanelRoad.PANEL_WIDTH, PanelRoad.PANEL_HEIGHT);
			pnlRoads[i].setBackground(new Color(0, 0, 0, 0));	// last parameter is to transparent background.
		}
		
		btnStart = new ButtonStart(vehicles);
		btnStart.setBounds(32*13, 32*18, 32*6, 32*3);
		
		// Add components
		for (int i=0 ; i<pnlRoads.length ; i++)
		{
			add(pnlRoads[i]);
		}
		add(btnStart);
	}
	
	public void paintComponent(Graphics g)
	{
		// Draw background image
		g.drawImage(imgBackground, 0, 0, this);
	}
	
	public int getSelectedVehicleIndex(int idxRoad)
	{
		return pnlRoads[idxRoad].getSelectedVehicleIndex();
	}
	
	public void hideControlComponents()
	{
		for (int i=0 ; i<pnlRoads.length ; i++)
		{
			pnlRoads[i].hideControlComponents();
		}
		btnStart.setVisible(false);
	}
	
	public void showControlComponents()
	{
		for (int i=0 ; i<pnlRoads.length ; i++)
		{
			pnlRoads[i].showControlComponents();
		}
		btnStart.setVisible(true);
	}
	
	public void startRacing()
	{
		final int delay = 1;
		final PanelBackground parent = this;
		
		// Define class
		class TimerListener implements ActionListener
		{
			private boolean isStop;
			private int selectedIndex[];
			
			public TimerListener()
			{
				selectedIndex = new int[vehicles.length];
				for (int i=0 ; i<selectedIndex.length ; i++)
				{
					selectedIndex[i] = getSelectedVehicleIndex(i);
				}
			}
			
			public void actionPerformed(ActionEvent event)
			{
				for (int i=0 ; i<vehicles.length ; i++)
				{
					vehicles[i][getSelectedVehicleIndex(i)].move(Vehicle.DIR_EAST);
					
					// Check this vehicle reach the finish line.
					if (parent.getBounds().width <=
						vehicles[i][selectedIndex[i]].getBounds().x +
						vehicles[i][selectedIndex[i]].getBounds().width)
					{
						parent.stopRacing();
						isStop = true;
					}
				}
				
				if (isStop)
				{
					if ((vehicles[0][selectedIndex[0]].getBounds().x +
						vehicles[0][selectedIndex[0]].getBounds().width) >
						(vehicles[1][selectedIndex[1]].getBounds().x +
						vehicles[1][selectedIndex[1]].getBounds().width))
					{
						JOptionPane.showMessageDialog(null, "Player1 win!");
					}
					else if ((vehicles[0][selectedIndex[0]].getBounds().x +
							vehicles[0][selectedIndex[0]].getBounds().width) <
							(vehicles[1][selectedIndex[1]].getBounds().x +
							vehicles[1][selectedIndex[1]].getBounds().width))
					{
						JOptionPane.showMessageDialog(null, "Player2 win!");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Draw!");
					}
				}
			}
		}
		
		tmrMover = new Timer(delay, new TimerListener());
		tmrMover.start();
		
		hideControlComponents();
	}
	
	public void stopRacing()
	{
		tmrMover.stop();
		
		showControlComponents();
	}
}
