package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	
	
	String Input=JOptionPane.showInputDialog("Enter your name");
	
	JOptionPane.showMessageDialog(null, "Hello, " + Input + " How are you?");
	
}
}
