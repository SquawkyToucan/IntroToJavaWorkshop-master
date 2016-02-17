package day3;

import java.io.IOException;

import javax.swing.JOptionPane;
//Der Talk ist "Anna," so es ist in Deutsch und nicht in Englisch.
public class StephenHawking {
	public static void main(String[] args){
		for (int i = 0; i < 30; i++) {
		String words = JOptionPane.showInputDialog("Type a sentence.");
		speak(words);
		}
		/*for (int i = 0; i < 10; i++) {
			speak("You are" + words + ".");
		}
		speak("Now, you are annoyed.");
		for (int i = 0; i < 10; i++) {
			speak("You are annoyed.");
		}
		speak("Now, you are so infuriated you would rather punch the computer and break your hand over listening to me.");
		for (int i = 0; i < 3; i++) {
			speak("You are so infuriated you would rather punch the screen and break your hand than continue listening.");
		}
		speak("Goodbye. Thank you for putting up with this.");
		for (int i = 0; i < 1000000000; i++) {
			//speak("Nevermind. Du bist ein Arsch das ist doof.");
			
		}*/
	}

	// 1. make a main method and put steps 2, 3 & 4 inside it
	// 2. ask the user for a sentence
	// 3. call the speak method below and send it the sentence
	// 4. repeat steps 2 and 3 a lot of times

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
