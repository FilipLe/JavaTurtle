package exercises;

import tbs.gfx.Turtle;
import tbs.simpleapp.SimpleApp;
import java.util.Scanner;

public class ExerciseTurtle extends SimpleApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExerciseTurtle();	
	}
	public void main() 
	{
		Scanner scan = new Scanner(System.in);
		Turtle t = screen.createTurtle();
		/*
		 * ARTSY BIT
		for(int i = 0; i<300; i+=1) {
			t.setColour((int)(Math.random() * 0x1000000));
			t.move(i);
			t.rotate(98);
		}*/
		
		System.out.println("Enter number of sides:");
		String input = scan.nextLine();
		int sides = Integer.parseInt(input);
		//Formula for total interior angles = (n-2)*180
		int totalInteriorAngle = (sides-2)*180;
		//Formula for 1 angle in polygon = total angle ÷ number of angles(or sides)
		int internalAngle = totalInteriorAngle/sides;
		for(int x = 0; x < totalInteriorAngle; x+=internalAngle) 
		{
			t.move(50);
			t.rotate(180-internalAngle);
		}
	}

}
