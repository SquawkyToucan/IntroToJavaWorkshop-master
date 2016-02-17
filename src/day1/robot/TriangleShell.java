package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {
	// Remember all semicolons, or else it will not work.
	// 1. Create a new Robot
Robot Trianus = new Robot ("mini");
	
	void go() {
		// 6. Make the robot go as fast as possible
Trianus.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
int length = 100;
		// 7. Do the following (up to step 10) 60 times
for (int i = 0; i < 60; i++) {
Trianus.penDown();
			// 9. Change the color of the pen to a random color
	Trianus.setRandomPenColor();
			// 8. Increase the length of the side by 10 pixels
	length += 10;
			// 5. call your drawTriangle() method using your length variable
	drawTriangle(length);
			// 10. Turn the tortoise 6 degrees to the right
	Trianus.turn(6);
}

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
	for (int i = 0; i < 3; i++) {
		Trianus.move(length);
		Trianus.turn(120);
		
	}
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
