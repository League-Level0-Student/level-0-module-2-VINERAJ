//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		for(int i=0;i<10;i++) {
		if(randomNumber == 0) {JOptionPane.showMessageDialog(null, "you're foot fungus is almost nonexistent");}
		else if(randomNumber == 1) {JOptionPane.showMessageDialog(null, "You would survive the zombie apocalypse because you're as ugly as an ugly person");}
		else if(randomNumber == 2) {JOptionPane.showMessageDialog(null, "Are you always so stupid or is today a special occasion?");}
		else if(randomNumber == 3) {JOptionPane.showMessageDialog(null, "As an outsider, what do you think of the human race?");}
		else if(randomNumber == 4) {JOptionPane.showMessageDialog(null, "Hi, I’m a human being. What are you?");}
		else if(randomNumber == 5) {JOptionPane.showMessageDialog(null, "Don’t think, it might sprain your brain.");}
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
