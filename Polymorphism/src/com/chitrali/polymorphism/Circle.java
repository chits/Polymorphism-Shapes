package com.chitrali.polymorphism;
import java.awt.*;

/**<h1>Circle</h1>
 * Class Circle implements the Shape Interface
 * @author Chitrali
 *
 */
public class Circle implements Shape {
/**
 * Fields
 * (x,y)= Coordinates of center of circle
 * radius= radius of circle
 */
protected int x,y,radius;
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
	return "Circle\nCenter: ["+x+","+y+"]"+" Radius:"+radius;
}
/**
 * Implementation of draw() function of Shape 
 * Interface.
 * @param g Object of Graphics class
 * @see java.awt.draw
 */
public void draw(Graphics g){
	g.setColor(color);
	g.drawOval(x, y, radius, radius);
}

}
