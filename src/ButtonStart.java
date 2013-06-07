import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;


public class ButtonStart extends JButton implements MouseListener
{
	private Image imgMouseout;
	private Image imgMouseover;
	private boolean isOver;
	private Vehicle vehicles[];
	
	public ButtonStart(Vehicle _vehicles[])
	{
		vehicles = _vehicles;
		
		imgMouseout = new ImageIcon("res/flag_mouseout.png").getImage();
		imgMouseover = new ImageIcon("res/flag_mouseover.png").getImage();
		this.setBorder(null);

		this.addMouseListener(this);
	}
	
	protected void paintComponent(Graphics g)
	{
		g.drawImage(isOver?imgMouseover:imgMouseout, 0, 0, this);
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		final int delay = 1;
		
		// Define class
		class TimerListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				for (int i=0 ; i<vehicles.length ; i++)
				{
					vehicles[i].move(Vehicle.DIR_EAST);
				}
			}
		}
		
		Timer tmrMover = new Timer(delay, new TimerListener());
		tmrMover.start();
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		isOver = true;
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		isOver = false;
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
	}
}
