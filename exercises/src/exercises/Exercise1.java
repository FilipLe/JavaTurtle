package exercises;

import tbs.simpleapp.SimpleApp;
import java.util.Random;

public class Exercise1 extends SimpleApp{
	Random rand = new Random();
	int x = 0;
	//generate random value for y-coord
	int y = rand.nextInt(300);
	int dy = 1;
	int dx = 1;
	
	public static void main(String[] args) {
		new Exercise1();
	}
	
	public void main() {
		screen.setColour(0xff0000);
		/*for(int x = 0; x < 400; x++) {
			screen.plot(x, 200);
			sleep(20);//Slows down for loop
			//-->Every time we go around the loop
			//we are going to wait 20 miliseconds
			//before we plot on screen again
		}*/
	}
	
	/*public String generateColor() {
		Random r = new Random();
	    final char [] hex = { '0', '1', '2', '3', '4', '5', '6', '7',
	                          '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
	    char[] s = new char[7];
	    int n = r.nextInt(0x1000000);

	    s[0] = '#';
	    for (int i=1;i<7;i++) {
	        s[i] = hex[n & 0xf];
	        n >>= 4;
	    }
	    return new String(s);
	}*/
	
	public void onFrame() {
		screen.plot(x, y);
		x += dx;
		y += dy;
		
		//y is inverted
		//When we reach y=-399, 
		//move the line upwards
		if(y == 399) {
			dy = -1;
			screen.setColour((int)(Math.random() * 0x1000000));
		}
		
		//If line reaches end of x-axis
		//start moving backwards to the left 
		if(x == 399) {
			dx = -1;
			screen.setColour((int)(Math.random() * 0x1000000));
		}
		//when line reaches top
		// move it downwards again
		if(y == 0) {
			dy = 1;
			screen.setColour((int)(Math.random() * 0x1000000));
		}
	}
	/*
	 * public void onFrame() {
		screen.plot(x, y);
		x += dx;
		y += dy;
		
		//y is inverted
		//When we reach y=-399, 
		//move the line upwards
		if(y == 399) {
			dy = -1;
			screen.setColour(Integer.parseInt(generateColor()));
		}
		
		//If line reaches end of x-axis
		//start moving backwards to the left 
		if(x == 399) {
			dx = -1;
			screen.setColour(Integer.parseInt(generateColor()));
		}
		//when line reaches top
		// move it downwards again
		if(y == 0) {
			dy = 1;
			screen.setColour(Integer.parseInt(generateColor()));
		}
	}
	 */
}
