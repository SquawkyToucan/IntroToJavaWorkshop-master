package day3;

import javax.swing.JOptionPane;

public class DialogAttacks {
public static void main(String[] args){
	String name = JOptionPane.showInputDialog("Hello and welcome to the DialogAttacks® Machine. \nQuestion 1: What is your name? \n(Please don't answer in complete sentences.)");
	JOptionPane.showMessageDialog(null, "Hello " + name + "!");
	String bday = JOptionPane.showInputDialog("When is your birthday? \nPlease enter in MM/DD/YYYY form.");
	JOptionPane.showMessageDialog(null, "Confirming that your birthday is " + bday + ".");
	String email = JOptionPane.showInputDialog("If I were to need to contact you, what is your email? \nPlease answer in form of name@example.com.");
	JOptionPane.showMessageDialog(null, "If something goes wrong, you will recieve an email at " + email + ". No worries, though.");
	String adress = JOptionPane.showInputDialog("Where is your adress? \nAnswer like this: Number, Street, City, State, ZIPCODE.");
	JOptionPane.showMessageDialog(null,"You are located at " + adress + ".");
	JOptionPane.showMessageDialog(null, "Thank you for sacraficing your personal information so people can use your personal information to hack into the IRS and steal your tax refunds. \nHave a good day! \nCopyright Evil Hackers, Inc., 2016.");
}
}
