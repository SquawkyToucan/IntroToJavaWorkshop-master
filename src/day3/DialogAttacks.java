package day3;

import javax.swing.JOptionPane;

public class DialogAttacks {
public static void main(String[] args){
	String name = JOptionPane.showInputDialog("Hello and welcome to the DialogAttacks® Machine. \n Question 1: What is your name? \n (Please don't answer in complete sentences.)");
	JOptionPane.showMessageDialog(null, "Hello " + name + "!");
	String bday = JOptionPane.showInputDialog("When is your birthday? \n Please enter in MM/DD/YYYY form.");
	JOptionPane.showMessageDialog(null, "Confirming that your birthday is " + bday + ".");
	String email = JOptionPane.showInputDialog("If I were to need to contact you, what is your email? \n Please answer in form of name@example.com.");
	JOptionPane.showMessageDialog(null, "If something goes wrong, you will recieve an email at" + email + ". No worries, though.");
	String adress = JOptionPane.showInputDialog("Where is your adress? \n Answer like this: Street, City, State, ZIPCODE.");
}
}
