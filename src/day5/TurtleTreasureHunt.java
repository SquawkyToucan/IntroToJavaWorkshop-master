package day5;

	import java.awt.KeyEventDispatcher;
	import java.awt.KeyboardFocusManager;
	import java.awt.event.KeyEvent;
	import java.net.MalformedURLException;

	import javax.swing.JOptionPane;

	import org.teachingextensions.logo.ImageBackground;
	import org.teachingextensions.logo.Paintable;
	import org.teachingextensions.logo.Tortoise;

	/** Note: You will need the latest version of the TKP jar: http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar **/

	public class TurtleTreasureHunt implements KeyEventDispatcher {

		int tortoiseSpeed = 5;

		private void goUp() {
			// 1. Make the tortoise move up the screen
			Tortoise.setAngle(0);
			Tortoise.move(10);
		}

		private void goDown() {
			// 2. make the tortoise move down the screen
			Tortoise.setAngle(0);
			Tortoise.move(-10);
		}

		private void goLeft() {
			// 3. make the tortoise move left (3 lines of code)
			Tortoise.setAngle(-90);
			Tortoise.move(10);
			// Hint: the turn() method lags more than setAngle()

		
		
		}

		private void goRight() {
			// 4. make the tortoise move right
			Tortoise.setAngle(90);
			Tortoise.move(10);
		}

		private void spaceBarWasPressed() {
			int tortoiseLocationX = Tortoise.getX();
			int tortoiseLocationY = Tortoise.getY();

			// 5. Print out the variables for tortoiseLocationX and tortoiseLocation.
			System.out.println("x: " + tortoiseLocationX + "y:" + tortoiseLocationY);
			// 6. If tortoise is at same location as the little girl,
			// 			make a pop-up tell the Tortoise where to go next
			if (tortoiseLocationX == 500 && tortoiseLocationY == (300)){
				JOptionPane.showMessageDialog(null, " Girl: On the torches, \n Blazing and hot, \n One has forgotten, \n But one has not. \n Choose wrong, \n And you will be lead, \n To a path, \n And not the chest.");
			}

			// 7. Give the user subsequent clues at different locations on the image
			if (tortoiseLocationX == 560 && tortoiseLocationY == (110)){
				JOptionPane.showMessageDialog(null, " You have chosen your torch. \n \n I may have forgotten, but from what I know, \n The fish knows where the treasure is stowed.");
				//Correct path
			}
			if (tortoiseLocationX == 50 && tortoiseLocationY == (190)){
				JOptionPane.showMessageDialog(null, " You have chosen your torch. \n \n I am old. I may be not right, \n but the cannon has the treasure in sight.");
				//Incorrect path
			}
			if (tortoiseLocationX == 330 && tortoiseLocationY == (410)){
				JOptionPane.showMessageDialog(null, " The bluish green bird, \n Old and wise, \n Thinks he knows, \n where the treasure lies.");
				//Correct path
			}
			if (tortoiseLocationX == 550 && tortoiseLocationY == (300)){
				JOptionPane.showMessageDialog(null, "Go to the skull's eye \nThat isn't blind. \nThat will the place \nWhere you will find.");
				//Correct path to merger
				}
			if (tortoiseLocationX == 480 && tortoiseLocationY == 180){
				JOptionPane.showMessageDialog(null, "You have been redeemed. Be warned you were wrong. \nChoosing that torch wasn't strong. \nHowever, you have moved to the right path, if you find the eye still intact.");
				//Incorrect path to merger
			}
			if (tortoiseLocationX == 140 && tortoiseLocationY == (40)){
				JOptionPane.showMessageDialog(null, "Make another bad choice. The one you choose is your voice. \nTake the fat parrot or take the shiny bot, one is correct and one is not.");
				
			}
			if (tortoiseLocationX == 400 && tortoiseLocationY == (260)){
				JOptionPane.showMessageDialog(null, "You chose the pirate! I know not! Of the location of the treasure you sought \nMaybe if you were thinking right, you wouldn't be in such a fright.");
				JOptionPane.showMessageDialog(null, "Game over! You failed to find the treasure!");
				//YOU LOSE!
			}
			if (tortoiseLocationX == 420 && tortoiseLocationY == (100)){
				JOptionPane.showMessageDialog(null, "Hooray! You found me, the bird with the treasure that you cannot see.");
				JOptionPane.showMessageDialog(null, "You win! Congratulations!");
			}
			
			}
			// (pirate robot, swamp, parrots, etc.)

			
		

		private void go() {
			KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
			/*
			 * If you want to use your own background, download the image you want, and change the following line to point to it like: new
			 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
			 */
			Paintable backgroundImage = new ImageBackground("file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
			Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
			Tortoise.penUp();
			JOptionPane.showMessageDialog(null, "Ask the little girl for help with your quest, as of all the people, she is best. \nUse the space bar to ask, and you will start a daunting task. \nAlways ask them from the head.");
		}

		public boolean dispatchKeyEvent(KeyEvent e) {
			if (e.getID() == KeyEvent.KEY_PRESSED) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT)
					goRight();
				else if (e.getKeyCode() == KeyEvent.VK_LEFT)
					goLeft();
				else if (e.getKeyCode() == KeyEvent.VK_UP)
					goUp();
				else if (e.getKeyCode() == KeyEvent.VK_DOWN)
					goDown();
				else if (e.getKeyCode() == KeyEvent.VK_SPACE)
					spaceBarWasPressed();
			}
			return false;
		}

		public static void main(String[] args) throws MalformedURLException {
			new TurtleTreasureHunt().go();
		}
	}




