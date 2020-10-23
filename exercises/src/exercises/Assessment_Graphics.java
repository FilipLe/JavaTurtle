package exercises;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.*;

public class Assessment_Graphics {
	Scanner scan = new Scanner(System.in);
	public void start() {
		shape5(); /* Change this to the name of the question you want to test. */
	}
	public void shape1() {
		//Diagonal line negative gradient
		//if points positive -->(0,0),(1,1),... -->line goes upwards
		//however, in 2D (not 3D) computer graphics, y-coord is inverted
		//that's why here line goes downwards
		for(int x1 = 100; x1 < 251; x1++)
			plot(x1, x1);
		
		//Diagonal line 2 positive gradient
		for(int x1 = 100; x1 < 251; x1++) {
			//to make it go upwards, invert the y-axis
			plot(x1, -x1+350);
		}
		
		//horizontal line
		for(int x = 100; x < 251; x++)
		{
			plot(x,175);
		}
		
		//vertical line
		for(int y = 100; y < 251; y++) 
		{
			plot(175,y);
		}
	}

	public void shape2() {
		//Upper horizontal line
		for(int x = 100; x < 251; x++)
		{
			plot(x,100);
		}
		
		//Middle horizontal line
		for(int x = 100; x < 251; x++)
		{
			plot(x,200);
		}
		
		//Bottom horizontal line
		for(int x = 100; x < 251; x++)
		{
			plot(x,300);
		}
		
		//Left upper vertical line
		for(int y = 100; y < 201; y++)
		{
			plot(100,y);
		}
		
		//Right bottom vertical line
		for(int y = 200; y < 301; y++)
		{
			plot(250,y);
		}
	}

	public void shape3() {
		/*
    -----------------------------------------		
		1st Line Going up
		for(int x1 = 30; x1 < 50; x1++)
			//First line going up
			//Steeper gradient
			//Instead of 1 up,1 right
			//3 up 1 right
			plot(x1, 3*(-x1+150));
		
		3rd Line Going up
		for(int x1 = 70; x1 < 90; x1++)
			plot(x1, 3*(-x1+190));
	-----------------------------------------	
		2nd Line Going Down	
		for(int x1 = 50; x1 < 70; x1++)
			plot(x1, 3*(x1+50));
		
		4th Line going down
		for(int x1 = 90; x1 < 110; x1++)
			plot(x1, 3*(x1+10));
		-->There is a general pattern	
		
	-----------------------------------------	
	*/
		//Loop to draw 8 lines going up
		for(int x = 30; x < 320; x+=40) 
		{
			for(int x1 = x; x1 < x+20; x1++)
				plot(x1, 3*(-x1+x+120));
		}
		//Loop to draw 8 lines going down
		for(int x = 50; x < 360; x+=40) 
		{
			for(int x1 = x; x1 < x+20; x1++)
				plot(x1, 3*(x1-x+100));
		}	
	}

	public void shape4() {
		//CENTER OF SQUARES
		//x-coord of center
		int xCenter = 200;
		//y-coord of center
		int yCenter = 200;
		//Main loop
		for(int length = 20; length < 300; length += 30) {
			//x-coord of upper left corner
			//half of the length away from the center (or midpoint)
			int x1 = xCenter - length/2;
			//y-coord of upper left corner
			//half of the length away from the center (or midpoint)
			int y1 = yCenter - length/2;
			//draw top side
			for(int x = xCenter - length/2; x < x1+length; x++) 
			{
				//x var changing
				plot(x,y1);
			}
			//draw left side 
			for(int y = yCenter - length/2; y < y1+length; y++) 
			{
				//y var changing
				//as y var increases, further down it goes
				//because y val is inverted
				plot(x1,y);
			}
			//draw bottom side
			for(int x = xCenter - length/2; x < x1+length; x++) 
			{
				plot(x,y1+length);
			}
			//draw right side
			for(int y = yCenter - length/2; y < y1+length; y++) 
			{
				plot(x1+length,y);
			}
		}
		/*
		 * ---------------------------------------------------------
		 * TESTING BEFORE IMPLEMENTING FOR LOOP
		 
		//1st INNER SQUARE
		//side length of square
		int length1 = 20;
		//x-coord of upper left corner
		int x1 = xCenter - length1/2;
		//y-coord of upper left corner
		int y1 = yCenter - length1/2;
		//draw top side
		for(int x = xCenter - length1/2; x < x1+length1; x++) 
		{
			plot(x,y1);
		}
		//draw left side 
		for(int y = yCenter - length1/2; y < y1+length1; y++) 
		{
			plot(x1,y);
		}
		//draw bottom side
		for(int x = xCenter - length1/2; x < x1+length1; x++) 
		{
			plot(x,y1+length1);
		}
		//draw right side
		for(int y = yCenter - length1/2; y < y1+length1; y++) 
		{
			plot(x1+length1,y);
		}
		
		//2nd Square from the center
		//side length of square
		int length2 = 50;
		//x-coord of upper left corner
		int x2 = xCenter - length2/2;
		//y-coord of upper left corner
		int y2 = yCenter - length2/2;
		//draw top side                      
		for(int x = xCenter - length2/2; x < x2+length2; x++) 
		{
			plot(x,y2);
		}
		//draw left side                    
		for(int y = yCenter - length2/2; y < y2+length2; y++) 
		{
			plot(x2,y);
		}
		//draw bottom side
		for(int x = xCenter - length2/2; x < x2+length2; x++) 
		{
			plot(x,y2+length2);
		}
		//draw right side
		for(int y = yCenter - length2/2; y < y2+length2; y++) 
		{
			plot(x2+length2,y);
		}*/
	}
	
	public void shape5() {
		//x-coord of center
		int h = 200;
		//y-coord of center
		int k = 200;
		//assign var for x-coord for points on circle
		int x;
		//assign var for y-coord for points on circle
		int y;
		//declare a variable for radius
		double radius;
		//Logarithmic Spiral Equation
		//https://goldenratiomyth.weebly.com/the-logarithmic-spiral.html
		for(double theta=0;theta<360;theta+=0.01){
			//radius = e^(a*theta)
			//e --> mathematical constant e
			//a is a constant
			//theta is the angle
			radius = Math.pow(Math.E,0.3*theta);
			
			//In unit circle, the x-coord is on the cos-axis
			//to find x val of point on the circle:
			//x-coord of center + distance in x axis to point (x,y) on circle, in terms of x
			//to find distance to x value-->cos(angle)
			//but in unit circle, radius is 1. we want different radius --> multiply by radius
			x = (int)(h + radius*Math.cos(theta));
			//The same for y val but with sin(angle) instead
			y = (int)(k + radius*Math.sin(theta));
			plot(x, y);
		}
	}

	/***************************************************
	 * Please do not change any code below this point. *
	 ***************************************************/

	private final int WIDTH = 400;
	private final int HEIGHT = 400;
	private final JPanel screen;
	private final BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	
	public static void main(String[] args) {
		new Assessment_Graphics().start();
	}
	
	public Assessment_Graphics() {
		JFrame frame = new JFrame("Java Test 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen = new JPanel() {
			private static final long serialVersionUID = 1L;
			public void paintComponent(Graphics g) { g.drawImage(image, 0, 0, null); }
		};
		screen.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.getContentPane().add(screen);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void plot(int x, int y) {
		if (x >= 0 && y >= 0 && x < WIDTH && y < HEIGHT) image.setRGB(x, y, 0xffffff);
		screen.repaint();
	}
}
