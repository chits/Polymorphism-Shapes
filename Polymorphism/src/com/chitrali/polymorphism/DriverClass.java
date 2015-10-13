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
	
	
	/**Field
	 * JPanel shapePanel= to display the shape
	 */
	static JPanel shapePanel=new JPanel();
	
	/**Field
	 * JPanel inputPanel= to take the choice of user and display the string
	 * representation of the selected shape
	 */
	static JPanel inputPanel=new JPanel();
	/**Field
	 * JLabel toString= to display the string representation of the shape
	 */
	static JLabel toString= new JLabel("",JLabel.CENTER);
	/**Field
	 * JComboBox shapeBox= to display choices to user
	 */
	static JComboBox<String> shapeBox=new JComboBox<String>();
	/**Field
	 * JButton drawShape= to draw the shape
	 */
	static JButton drawShape = new JButton("DRAW SHAPE");
	/**
	 * Field
	 * JButton loadFile=to load file
	 */
	static JButton loadFile= new JButton("LOAD FILE");
	/**
	 * Field
	 * JTextField text to input filename
	 */
	static JTextField text=new JTextField(10);
	/**
	 * Field
	 * JLabel text to display text and error messages
	 */
	static JLabel input=new JLabel("",JLabel.LEFT);
	/**Field
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
	 * @param g Graphics class Object
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 * @see com.chitrali.polymorphism.Shape#draw(java.awt.Graphics)
	 * 
	 */
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		/*
		 * For each item in the ArrayList Shapes we check to which of the shape class
		 * it belongs.Then we call the functions to draw the shape and print the
		 * string representation.
		 */
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
	 * This is the main method defines a Field JFrame shape on which all other components are added.
	 * Events on the two buttons Load File and Draw Shape are also defined.
	 * @param args which are empty
	 * 
	 */
	
	public static void main(String[] args) {
		
		JFrame shape=new JFrame("Polymorphism with Shapes");
		shape.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		shape.setLayout(new FlowLayout());
		shape.getContentPane().setBackground(Color.BLACK);
		inputPanel.setBackground(Color.black);
		shapePanel.setBackground(Color.BLACK);
		shapePanel.setVisible(false);
		
		shapePanel.add(new DriverClass());
		shapeBox.addItem("Select a Shape");
		inputPanel.add(toString);
		drawShape.setVisible(false);
		
		inputPanel.add(input);
		inputPanel.add(text);
		inputPanel.add(loadFile);
		
		inputPanel.add(shapeBox);
		inputPanel.add(drawShape);
	    inputPanel.setVisible(true);
	    text.setVisible(true);
	    
	    toString.setVisible(false);
	    shapeBox.setVisible(false);
	    shape.add(inputPanel);
	    shape.add(shapePanel);
	    toString.setOpaque(true);
		toString.setForeground(Color.WHITE);
		toString.setBackground(Color.BLACK);
		toString.setFont(new Font("Comic Sans Ms", Font.BOLD, 20));
		input.setOpaque(true);
		input.setForeground(Color.WHITE);
		input.setBackground(Color.BLACK);
		input.setFont(new Font("Comic Sans Ms", Font.BOLD, 20));
		input.setText("Enter the filename:");
		
		/*
		 * Event on the click of Load File Button is defined.
		 */
		
		loadFile.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				boolean hasFile=false;
				String filename=text.getText();
				hasFile=readFile(filename);
				if(hasFile){
				text.setVisible(false);
				loadFile.setVisible(false);
				input.setVisible(false);
				shapeBox.setVisible(true);
				drawShape.setVisible(true);
				}
				else{
					text.setVisible(false);
					loadFile.setVisible(false);
					input.setText("File Not found");
				
				}
				
			}

		});
		
		/*
		 * Event on the click of DRAW SHAPE button is defined.
		 */
	    
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
	/**
	 * This function reads the shape file entered by user and creates the 
	 * instances of each each.The instances are stored in ArrayList of Shape Interface.
	 * @param name filename of shape file
	 * @return boolean variable File that tells whether the file entered by user exists or not.
	 * @exception File not found, I/O exception
	 */
	static public boolean readFile(String name){
		
		boolean File=false;
		Shapes=new ArrayList<Shape>();
		File input=new File(name);
		String line;
		/*
		 * Input text file Shape is read.Each shape is read from the file and its instance is created.
		 * The instance is then added to the ArrayList Shape.
		 */
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
				shapeBox.addItem(st[0]);
			}
			File=true;
			in.close();
					
		} catch (FileNotFoundException e) {
			
			File=false;
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return File;
		
	}

	
}
