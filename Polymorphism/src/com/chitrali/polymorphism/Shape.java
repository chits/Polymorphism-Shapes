package com.chitrali.polymorphism;

import java.awt.*;

/**
 * This is an Interface that declare two methods applicable for all types 
 * of shapes e.g. circle,rectangle etc.
 * @author Chitrali
 *
 */
public interface Shape {
	/**Generate string representation of shape
	 * @return String representation of shape
	 */
	String toString();
	/**
	 * Draws the shape
	 * @param g Object of Graphics class
	 */
	void draw(Graphics g);

}
