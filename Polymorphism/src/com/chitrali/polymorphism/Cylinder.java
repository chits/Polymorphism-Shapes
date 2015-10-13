package com.chitrali.polymorphism;
import java.awt.*;

/**<h1>Cylinder shape class</h1>
 * This class implements the Shape Interface and defines the two interface 
 * methods for the shape Cylinder.
 * @author Chitrali
 * @since 2015-10-12
 */
public class Cylinder implements Shape {
	
	/**
	 * x coordinate of upper ellipse center
	 */	
	protected int x1;
	/**
	 * y coordinate of upper ellipse center
	 */
	protected int y1;
	/**
	 * radius of the ellipse
	 */
	protected int radius;
	/**
	 * width of ellipse
	 */
	protected int width;
	
	/**
	 * x coordinate of First point of left vertical line
	 */	
	protected int x2;
	/**
	 * y coordinate of First point of left vertical line
	 */
	protected int y2;
	/**
	 * x coordinate of Second point of left vertical line
	 */
	protected int x3;
	/**
	 * y coordinate of Second point of left vertical line
	 */
	protected int y3;
	
	/**
	 * x coordinate of First point of right vertical line
	 */	
	protected int x4;
	/**
	 * y coordinate of First point of right vertical line
	 */
	protected int y4;
	/**
	 * x coordinate of Second point of right vertical line
	 */
	protected int x5;
	/**
	 * y coordinate of Second point of right vertical line
	 */
	protected int y5;
	
	/**
	 * x coordinate of center of lower ellipse
	 */
	protected int x6;
	/**
	 * y coordinate of center of lower ellipse
	 */
	protected int y6;
	/**
	 * color=color of the cylinder
	 */
	protected Color color;
	/**
	 * Constructor to initialize the fields of Cylinder class
	 * @param a1
	 * @param b1
	 * @param r
	 * @param w
	 * @param a2
	 * @param b2
	 * @param a3
	 * @param b3
	 * @param a4
	 * @param b4
	 * @param a5
	 * @param b5
	 * @param a6
	 * @param b6
	 */
	public Cylinder(int a1,int b1,int r,int w,int a2,int 
			b2,int a3,int b3,int a4,int b4,int a5,int b5,int a6,int b6 ){
		x1=a1;x2=a2;x3=a3;x4=a4;x5=a5;x6=a6;
		y1=b1;y2=b2;y3=b3;y4=b4;y5=b5;y6=b6;
		radius=r;width=w;
		color=Color.MAGENTA;
					
	}
	/** 
	 * Implementation of toString() function of the Shape interface for 
	 * Cylinder class
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "<html>Cylinder<br>UpperEllipse:Center:["+x1+","+y1+"] Radius:"+radius+
				" Width:"+width+"<br>Left Vertical line:["+x2+","+y2+"]["+x3+","+y3+
				"]<br>Right Vertical Line:["+x4+","+y4+"]["+x5+","+y5+"]"+
				"<br>LowerEllipse:Center:["+x6+","+y6+"] Radius:"+radius+" Width:"+width+"</html>";
				
	}
	/**
	 * Implementation of draw() method of Shape Interface for Cylinder Class 
	 * @param g of Graphics Class
	 * @see com.chitrali.polymorphism.Shape#draw(java.awt.Graphics)
	 */
	public void draw(Graphics g){
		g.setColor(color);
		g.drawOval(x1, y1, radius, width);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x4, y4, x5, y5);
		g.drawOval(x6, y6, radius, width);
	}
	

}
