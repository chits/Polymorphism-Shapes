package com.chitrali.polymorphism;
import java.awt.*;

/**<h1>Rectangle</h1>
 * Class Rectangle implements the Shape Interface
 * @author Chitrali
 * @since 2015-10-12
 * @since 2015-10-12
 */
public class Rectangle implements Shape {
	
	/**
	 * x coordinate of upper left corner
	 */	
	protected int x;
	/**
	 * y coordinate of upper left corner
	 */
	
	protected int y;
	/**
	 * width of rectangle
	 */
	protected int width;
	/**
	 * height of rectangle
	 */
	protected int height;
	/**
	 * color=color of rectangle
	 */
	protected Color color;
	/**
	 * Constructor to initialize the fields of Class Rectangle
	 * @param a
	 * @param b
	 * @param w
	 * @param h
	 */
	public Rectangle(int a,int b,int w,int h){
		x=a;y=b;
		width=w;height=h;	
		color=Color.RED;
	}
	
	/**
	 * Implementation of the toString() function of the Shape
	 * Interface for Rectangle class
	 * @return String representation of Rectangle 
	 */
	public String toString(){
		return "<html>Rectangle<br>Upper Left Corner: ["+x+","+y+"]"+" Width:"+width+" Height:"+height+"</html>";
	}
	/**
	 * Implementation of the draw() function of the Shape
	 * Interface for the Rectangle class.
	 * Draws the rectangle
	 * @param g
	 * @see com.chitrali.polymorphism.Shape#draw(java.awt.Graphics)
	 */
	public void draw(Graphics g){
		g.setColor(color);
		g.drawRect(x, y, width, height);
	}

}
