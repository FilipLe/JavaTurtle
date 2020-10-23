package exercises;

import tbs.gfx.Turtle;
import tbs.simpleapp.SimpleApp;

public class AdvancedDrawing extends SimpleApp {
	Turtle t = screen.createTurtle();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AdvancedDrawing().start();
	}
	
	public void start() 
	{
		//Write name of method you want to run
		shape3();
	}
	
	public void shape1() 
	{
		int sides = 6;
		//Formula for total interior angles = (n-2)*180
		int totalInteriorAngle = (sides-2)*180;
		//Formula for 1 angle in polygon = total angle ÷ number of angles(or sides)
		int internalAngle = totalInteriorAngle/sides;
		for(int distance = 10; distance < 400; distance += 5) {
			t.move(distance);
			t.rotate(180-internalAngle);
		}
	}
	
	public void shape2() 
	{
		int distance = 100;
		for(int angle = 0; angle < 360; angle += 5) 
		{
			t.setPosition(0,0);
			t.rotate(angle);
			t.move(distance);
		}
	}
	
	public void shape3() 
	{
		/*
		 * TESTING
		int distance = 10;
		for(int i = 0; i<4; i++) {
			t.move(distance);
			t.rotate(90);
		}
		t.setPenDown(false);
		t.rotate(10);
		t.move(5);
		t.setPenDown(true);
		distance = 15;
		for(int i = 0; i<4; i++) {
			t.move(distance);
			t.rotate(90);
		}*/
		t.setPosition(-10,-110);
		for(int distance = 10; distance < 250; distance += 5) 
		{
			for(int i = 0; i < 4; i++)
			{
				t.move(distance);
				t.rotate(90);
			}
			t.setPenDown(false);
			t.rotate(4);
			t.move(10);
			t.setPenDown(true);
		}
	}
	
	public void shape4() 
	{
		
	}
}
