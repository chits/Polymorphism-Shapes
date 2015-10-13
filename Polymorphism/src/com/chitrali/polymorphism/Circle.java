package com.chitrali.polymorphism;
import java.awt.*;

/**<h1>Circle Class</h1>
 * This class implements the Shape Interface and defines the two interface 
 * methods for the shape Cylinder.
 * @author Chitrali
 * @since 2015-10-12
 */
public class Circle implements Shape {

/**
 * x coordinate of center of circle
 */
protected int x;
/**
 * y coordinate of center of circle
 */
protected int y;
/**
 * radius of circle
 */
protected int radius;
/**
 * color=color of circle
 */
protected Color color;
/**
 * Constructor to initialize the fields of Class Circle
 * @param a 
 * @param b 
 * @param r 
 */
public Circle(int a,int b,int r){
	x=a;y=b;
	radius=r;
	color=Color.green;
}
/**
 * Implementation of the toString() function of Shape
 * Interface.
 * @return String representation of Circle
 */
public String toString(){
	return "<html>Circle<br>Center: ["+x+","+y+"]"+" Radius:"+radius+"</html>";
}
/**
 * Implementation of draw() function of Shape 
 * Interface.
 * @param g of Graphics class
 * @see com.chitrali.polymorphism.Shape#draw(java.awt.Graphics)
 */
public void draw(Graphics g){
	g.setColor(color);
	g.drawOval(x, y, radius, radius);
}

}
