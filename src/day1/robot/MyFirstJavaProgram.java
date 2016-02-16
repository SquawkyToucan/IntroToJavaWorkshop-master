package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE AND USE A SEMICOLON
Robot Weird = new Robot();
	Weird.setSpeed(10);
	Weird.move(200);
	Weird.sparkle();
	Weird.move(-300);
	Weird.unSparkle();
	Weird.move(200);
	Weird.sparkle();
	Weird.turn(90);
	Weird.turn(-180);
	Weird.turn(45);
	Weird.turn(30);
	Weird.turn(15);
	Weird.unSparkle();
	Weird.move(50);
	Weird.move(-50);
	for (int i = 0; i < 360; i++) {
	Weird.setRandomPenColor();
	Weird.penDown();
	for (int j = 0; j < 4; j++) {
		Weird.turn(90);
		Weird.move(100);
	}
	Weird.turn(1);
	}
	Weird.penUp();
	Weird.turn(-90);
	Weird.move(200);

	
		
		
	}
}
