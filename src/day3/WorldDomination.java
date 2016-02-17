package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		String fate = JOptionPane.showInputDialog("Do you know how to write code?(Scratch doesn't count!) \n (Answer yes or no)");
		if (fate.equalsIgnoreCase("yes")){
			JOptionPane.showMessageDialog(null, "You will soon rule the world.");
		}
		else{
			JOptionPane.showMessageDialog(null, "Good luck washing dishes!");
		}
		// 1. Ask the user if they know how to write code.

		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.

	}
}

