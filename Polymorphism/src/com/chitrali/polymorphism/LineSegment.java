package com.chitrali.polymorphism;
import java.awt.*;

/**
 * <h1>LineSegment Class</h1>
 * This is the class for the shape LineSegment that implements the 
 * interface Shape
 * @author Chitrali
 * @since 2015-10-12
 *
 */
public class LineSegment implements Shape {
	
	/**
	 * x coordinate of First line point
	 */	
	protected int x1;
	/**
	 * y coordinate of first line point
	 */
	protected int y1;
	/**
	 * x coordinate of second line point
	 */
	protected int x2;
	/**
	 * y coordinate of second line point
	 */
	protected int y2;
	/**
	 *  color to draw line segment
	 */
	protected Color color;
	/**
	 * Constructor to initialize the fields of class LineSegment
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 */
	public LineSegment(int a,int b,int c,int d){
		x1=a;y1=b;x2=c;y2=d;
		color=Color.BLUE;
		
	}
	/**
	 * Definition of the Implementation of toString() function of the Shape Interface
	 * 
	 * @return  String representation of Line Segment
	 */
	public String toString(){
		return "<html>LineSegment: ["+x1+","+y1+"]"+"["+x2+","+y2+"]</html>";
		
	}
	/**
	 * Definition of Implementation of draw() function of the Shape Interface
	 * @param g of the Graphics Class
	 * @see com.chitrali.polymorphism.Shape#draw(java.awt.Graphics)
	 */
	public void draw(Graphics g){
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
	}

}
