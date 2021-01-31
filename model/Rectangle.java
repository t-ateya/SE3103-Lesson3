package model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangle extends Shape {
	private float height;
	private float width;

	public Rectangle(float x, float y, Color color, float height, float width) {
		super(x, y, color);
		this.height = height;
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public float getWidth() {
		return width;
	}

	@Override
	public float getArea() {
		return width*width;
	}

	@Override
	public void render(Graphics2D g2) {
		g2.setColor(super.getColor());
		g2.drawRect((int)super.getx(), (int)super.getY(), (int)width, (int)height);
	}

	@Override
	public String toString(){
		return "[Rectangle: " + super.toString() + "h= " + height  +", "+ "w= " + width + "]";
	}
	
}
