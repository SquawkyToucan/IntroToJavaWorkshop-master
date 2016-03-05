package day3;

import javax.swing.JOptionPane;

public class PopUp {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Good Afternoon!");
		JOptionPane.showMessageDialog(null, "This is a text speaker.");
		for (int i = 0; i < 10; i++) {
			String speak = JOptionPane.showInputDialog("Say something the computer will speak.");
			speak(speak);
		}
	}

	private static void speak(String speak) {
		// TODO Auto-generated method stub

	}
}
