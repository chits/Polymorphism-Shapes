package com.chitrali.polymorphism;
import java.awt.*;

/**
 * <h1>LineSegment</h1>
 * This is the class for the shape LineSegment that implements the 
 * interface Shape
 * @author Chitrali
 * @since 2015-10-12
 *
 */
public class LineSegment implements Shape {
	/**
	 * Declaration of the coordinates of line segment
	 */
	protected int x1,y1,x2,y2;
	/**
	 * Declaration of the Field color used to draw line segment
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
		return "LineSegment: ["+x1+","+y1+"]"+"["+x2+","+y2+"]";
		
	}
	/**
	 * Definition of Implementation of draw() function of the Shape Interface
	 * @param Object of the Graphics Class
	 * @see Line segment 
	 */
	public void draw(Graphics g){
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
	}

}
