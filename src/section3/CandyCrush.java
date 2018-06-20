package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String name = JOptionPane.showInputDialog("Who do you not like?");
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + name);
		// 3. Ask the user for the name of their best friend
		name = JOptionPane.showInputDialog("Who is your best friend?");
		JOptionPane.showMessageDialog(null,  name + " is as sweet as candy");
		// 4. Tell them their best friend is as sweet as candy

	} 
}



