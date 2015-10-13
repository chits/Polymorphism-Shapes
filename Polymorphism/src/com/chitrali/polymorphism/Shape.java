package com.chitrali.polymorphism;

import java.awt.*;

/**
 * This is an Interface that declare two methods applicable for all types 
 * of shapes e.g. circle,rectangle etc.
 * @author Chitrali
 * @since 2015-10-12
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
	 * @see java.awt.Graphics
	 */
	void draw(Graphics g);

}
