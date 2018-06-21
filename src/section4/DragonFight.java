package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		int playerHealth=100;
		int dragonHealth=100;
		int dragonDmg=0;
		int playerDmg=0;
		String choice;
		Random r = new Random();
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		
		// 4. Create a variable to hold the damage the player's attack does each round
		
		// 5. Create a variable to hold the damage the dragon's attack does each round
		
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
			choice = JOptionPane.showInputDialog("Do you want to attack the dragon with a kick or yell?");
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		if (choice.equalsIgnoreCase("yell")) {
			dragonDmg=r.nextInt(10);
			dragonHealth=dragonHealth-dragonDmg;
		}
		if (choice.equalsIgnoreCase("kick")) {
			dragonDmg=r.nextInt(25);
			dragonHealth=dragonHealth-dragonDmg;
		} else {
			dragonHealth=0;
			dragonDmg=100;
		
		}
		playerDmg=r.nextInt(35);
	playerHealth=playerHealth-playerDmg;
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		
		// 9. If they typed in "yell":
		
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		
		// 12. Subtract this number from the player's health
		
		if (playerHealth<=0) {
			JOptionPane.showMessageDialog(null,"You lost");
			
		}
		if (dragonHealth<=0) {
			JOptionPane.showMessageDialog(null,"The dragon is dead and you took a ton of gold!");
			
		} else {
			JOptionPane.showMessageDialog(null,"Your Health: "+playerHealth + " Dragon Health " +  dragonHealth);
			JOptionPane.showMessageDialog(null,"Damage Taken: "+playerDmg + " Dragon Damage Taken " +  dragonDmg);
			
		}
		
		// 13. If the user's health is less than or equal to 0
		
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		}
		}
}

