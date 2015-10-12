package com.chitrali.polymorphism;

import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * <h1>Driver Class for implementing the class hierarchy of shapes</h1>
 * This class reads the input from the Shape file and creates instances of the shapes described
 * in it.The classes of different shapes are separately created that implement the Shape interface.
 * The output is displayed in a JFrame.
 * 
 * @author Chitrali
 * @since 2015-10-12
 * @version 1.0
 */

@SuppressWarnings("serial")
public class DriverClass extends JPanel {
	
	
	/**
	 * JPanel shapePanel= to display the shape
	 */
	static JPanel shapePanel=new JPanel();
	
	/**
	 * JPanel inputPanel= to take the choice of user and display the string
	 * representation of the selected shape
	 */
	static JPanel inputPanel=new JPanel();
	/**
	 * JLabel toString= to display the string representation of the shape
	 */
	static JLabel toString= new JLabel("",JLabel.CENTER);
	/**
	 * JComboBox shapeBox= to display choices to user
	 */
	static JComboBox<String> shapeBox=new JComboBox<String>();
	/**
	 * JButton drawShape= to draw the shape
	 */
	static JButton drawShape = new JButton("DRAW SHAPE");
	/**
	 * ArrayList Shapes= of Shape Interface
	 */
	static List <Shape> Shapes;
	
	/**
	 * This constructor of Driver class initializes the JPanel with Background and Dimension
	 */
	
	public DriverClass() {
		setPreferredSize(new Dimension(300, 300));
		setBackground(Color.BLACK);
	}
	

	
	/**
	 * Overriding the default implementation of paintComponent of panel
	 * This functions calls the toString() and draw() function of each shape class
	 * stored in the List Shapes of Interface Shape.
	 * @param g
	 * @see Shape and string representation of the shape in a JFrame
	 */
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(Shape s: Shapes)
		{
		    if(shapeBox.getSelectedItem().toString().equals("LineSegment"))
		    {
		    	if(s instanceof LineSegment)
			    {
		    		toString.setText(s.toString());s.draw(g);
			    }
		    }
		    else  if(shapeBox.getSelectedItem().toString().equals("Rectangle"))
		    {
		       	if(s instanceof Rectangle)
		       	{
		    		toString.setText(s.toString());
		    		s.draw(g);
		       	}
		    }
		    else  if(shapeBox.getSelectedItem().toString().equals("Circle"))
		    {
		       	if(s instanceof Circle)
		       	{
		    		toString.setText(s.toString());
		    		s.draw(g);
		       	}
		    }
		    else  if(shapeBox.getSelectedItem().toString().equals("Cylinder"))
		    {
		       	if(s instanceof Cylinder)
		       	{
		    		toString.setText(s.toString());
		    		s.draw(g);
		       	}
		    }
		}
	}
	

	/**
	 * This is the main method which reads the input file containing shapes
	 * and stores each shape in the List of Shape based on the instance type of 
	 * different shape classes e.g. circle, rectangle etc.
	 * It also defines a JFrame shape on which all other components are added.
	 * @param args which are empty
	 * @exception File not found , I/O exception
	 * 
	 */
	
	public static void main(String[] args) {
		Shapes=new ArrayList<Shape>();
		File input=new File("Shape");
		String line;
		try {
			BufferedReader in=new BufferedReader(new FileReader(input.getCanonicalPath()));
			while((line=in.readLine())!=null){
				String[] st=line.split(" ");
				if(st[0].equals("LineSegment")){
					 LineSegment lineSegment=new LineSegment(Integer.parseInt(st[1]),Integer.parseInt(st[2]),Integer.parseInt(st[3]),Integer.parseInt(st[4]));
					Shapes.add(lineSegment);
					}
				else if(st[0].equals("Rectangle")){
					 Rectangle rectangle=new Rectangle(Integer.parseInt(st[1]),Integer.parseInt(st[2]),Integer.parseInt(st[3]),Integer.parseInt(st[4]));
					Shapes.add(rectangle);
					
				}
				else if(st[0].equals("Circle")){
					 Circle circle=new Circle(Integer.parseInt(st[1]),Integer.parseInt(st[2]),Integer.parseInt(st[3]));
					Shapes.add(circle);
				}
				else if(st[0].equals("Cylinder")){
					 Cylinder cylinder=new Cylinder(Integer.parseInt(st[1]),Integer.parseInt(st[2]),Integer.parseInt(st[3]),Integer.parseInt(st[4]),
							 Integer.parseInt(st[5]),Integer.parseInt(st[6]),Integer.parseInt(st[7]),Integer.parseInt(st[8]),Integer.parseInt(st[9]),
							 Integer.parseInt(st[10]),Integer.parseInt(st[11]),Integer.parseInt(st[12]),Integer.parseInt(st[13]),Integer.parseInt(st[14]));
							
					Shapes.add(cylinder);
				}
			}
					
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		JFrame shape=new JFrame("Polymorphism with Shapes");
		shape.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		shape.setLayout(new FlowLayout());
		shape.getContentPane().setBackground(Color.BLACK);
		inputPanel.setBackground(Color.black);
		shapePanel.setBackground(Color.BLACK);
		
		shapePanel.add(new DriverClass());
		shapeBox.addItem("Select a Shape");
		shapeBox.addItem("LineSegment");
		shapeBox.addItem("Rectangle");
		shapeBox.addItem("Circle");
		shapeBox.addItem("Cylinder");
		inputPanel.add(toString);
		drawShape.setVisible(true);
	
		inputPanel.add(shapeBox);
		inputPanel.add(drawShape);
	    inputPanel.setVisible(true);
	 
	    toString.setVisible(false);
	    shape.add(inputPanel);
	    shape.add(shapePanel);
	    toString.setOpaque(true);
		toString.setForeground(Color.WHITE);
		toString.setBackground(Color.BLACK);
		toString.setFont(new Font("Comic Sans Ms", Font.BOLD, 20));
	    
		drawShape.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				shapeBox.setVisible(false);
				drawShape.setVisible(false);
				shapePanel.setVisible(true);
				toString.setVisible(true);
			}
		});
			    
		shape.pack();
		shape.setVisible(true);
		

	}

}
