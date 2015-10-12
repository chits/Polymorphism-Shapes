package com.chitrali.polymorphism;
import java.awt.*;

/**<h1>Rectangle</h1>
 * Class Rectangle implements the Shape Interface
 * @author Chitrali
 * @since 2015-10-12
 *
 */
public class Rectangle implements Shape {
	/**
	 * (x,y)=Coordinates of upper left corner of rectangle
	 * width=width of rectangle
	 * height=height of rectangle
	 */
	protected int x,y,width,height;
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
		return "Rectangle\nUpper Left Corner: ["+x+","+y+"]"+" Width:"+width+" Height:"+height;
	}
	/**
	 * Implementation of the draw() function of the Shape
	 * Interface for the Rectangle class.
	 * Draws the rectangle
	 * @param g
	 * @see rectangle
	 */
	public void draw(Graphics g){
		g.setColor(color);
		g.drawRect(x, y, width, height);
	}

}
