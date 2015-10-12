package com.chitrali.polymorphism;
import java.awt.*;

public class Cylinder implements Shape {
	protected int x1,y1,radius,width;
	protected int x2,y2,x3,y3;
	protected int x4,y4,x5,y5;
	protected int x6,y6;
	protected Color color;
	public Cylinder(int a1,int b1,int r,int w,int a2,int 
			b2,int a3,int b3,int a4,int b4,int a5,int b5,int a6,int b6 ){
		x1=a1;x2=a2;x3=a3;x4=a4;x5=a5;x6=a6;
		y1=b1;y2=b2;y3=b3;y4=b4;y5=b5;y6=b6;
		radius=r;width=w;
		color=Color.MAGENTA;
					
	}
	public String toString(){
		return "Cylinder\n UpperEllipse:Center:["+x1+","+y1+"] Radius:"+radius+
				" Width:"+width+"\nLeft Vertical line:["+x2+","+y2+"]["+x3+
				"]\nRight Vertical Line:["+x4+","+y4+"]["+x5+","+y5+"]"+
				"LowerEllipse:Center:["+x6+","+y6+"] Radius and Width are same";
				
	}
	public void draw(Graphics g){
		g.setColor(color);
		g.drawOval(x1, y1, radius, width);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x4, y4, x5, y5);
		g.drawOval(x6, y6, radius, width);
	}
	

}
