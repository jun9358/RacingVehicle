import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class VehicleIronman extends JComponent implements Vehicle {
	private static final String vehicleName = "Ironman";
	private static final int VEHICLE_WIDTH = 81;
	private static final int VEHICLE_HEIGHT = 96;

	private int speed;

	public VehicleIronman(int _speed) {
		speed = _speed;

		// Set size
		setSize(VEHICLE_WIDTH, VEHICLE_HEIGHT);
	}

	public String getName() {
		return vehicleName;
	}

	public void initVehicle() {
		setLocation(32 * 3 - VEHICLE_WIDTH, (32 * 3 - VEHICLE_HEIGHT) / 2);
	}

	public void paintComponent(Graphics g) {
		Graphics2D g1 = (Graphics2D) g;

		// Draw vehicle

		Color gold = new Color(225, 215, 0);
		Color red = new Color(225, 0, 0);
		Ellipse2D.Float c1 = new Ellipse2D.Float(95, 0, 50, 50);
		g1.setColor(red);
		g1.fill(c1);
		Arc2D.Float c2 = new Arc2D.Float(95, 0, 50, 50, 90, -90, Arc2D.PIE);
		g1.setColor(gold);
		g1.fill(c2);
		Arc2D.Float c3 = new Arc2D.Float(110, 7, 35, 35, 0, -90, Arc2D.PIE);
		g1.setColor(gold);
		g1.fill(c3);
		Rectangle2D.Float c4 = new Rectangle2D.Float(125, 10, 10, 5);
		g1.setColor(Color.CYAN);
		g1.fill(c4);
		g1.setStroke(new BasicStroke(1));
		Rectangle2D.Float c5 = new Rectangle2D.Float(40, 15, 60, 25);
		g1.setColor(red);
		g1.fill(c5);
		Rectangle2D.Float c6 = new Rectangle2D.Float(52, 25, 40, 10);
		g1.setColor(gold);
		g1.fill(c6);
		Rectangle2D.Float c7 = new Rectangle2D.Float(0, 25, 40, 10);
		g1.setColor(gold);
		g1.fill(c7);
		Rectangle2D.Float c8 = new Rectangle2D.Float(0, 22, 40, 10);
		g1.setColor(red);
		g1.fill(c8);
	}

	public void move(int direction) {
		this.setLocation(this.getLocation().x + dir[direction].x * speed,
				this.getLocation().y + dir[direction].y * speed);

		// Afterimage is remained, so repaint that part.
		this.getRootPane().repaint();
	}

	public Rectangle getBounds() {
		return super.getBounds();
	}

}
