import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class PanelBackground extends JPanel
{
	private Image imgBackground;
	
	public PanelBackground()
	{
		imgBackground = new ImageIcon("res/background.png").getImage();
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawImage(imgBackground, 0, 0, this);
	}
}
