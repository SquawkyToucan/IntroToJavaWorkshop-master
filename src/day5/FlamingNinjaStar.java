package day5;
import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variable in this recipe. 
 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs. */

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		Robot ninja = new Robot("mini");
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		ninja.setX(900);
		ninja.setY(500);
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 1. Make a new robot, and set it's pen down.

		// 12. Set the robot speed to 10
ninja.setSpeed(10);
		// 13. Make all the code below repeat 25 times
for (int i = 0; i < 25; i++) {

			// 2. Turn the robot 1/8 of a circle
		ninja.penDown();
		ninja.turn(45);
			// 3. Move the robot 64 pixels
		ninja.move(64);
			
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
		ninja.turn(-40);
			// 5. Move the robot the distance in the variable flameSize
		ninja.setPenColor(255, 255, 34);
		ninja.move(200);
			// 6. Turn the robot 170 degrees
		ninja.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
		ninja.move(flameSize);
			// 8. Turn the robot 64 degrees to the right
		ninja.setPenColor(0,0,0);
		ninja.turn(64);
			// 9. Move the robot the distance in the variable baseSize
		ninja.move(baseSize);
}
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			// 11. Color your ninja star like Figure 2.
		
	}

}


