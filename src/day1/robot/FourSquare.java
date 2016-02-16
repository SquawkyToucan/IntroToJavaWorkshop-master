package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot Snack = new Robot("VIC");

	void go() {
		// 4. Make the robot move as fast as possible
Snack.setSpeed(10);
		// 5. Set the pen width to 5
Snack.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
Snack.penDown();
for (int i = 0; i < 3; i++) {
	
for (int j = 0; j < 4; j++) {
	

			// 7. Set the pen color to random
	Snack.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
Snack.turn(90);
}
Snack.move(200);
	}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		for (int i = 0; i < 4; i++) {
		Snack.move(100);
		Snack.turn(90);
		}

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
