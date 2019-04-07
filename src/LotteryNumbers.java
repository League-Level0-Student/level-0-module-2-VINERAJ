import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random gen = new Random();
	int Number1 = gen.nextInt(100);
	int Number2 = gen.nextInt(100);
	int Number3 = gen.nextInt(100);
	int Number4 = gen.nextInt(100);
	int Number5 = gen.nextInt(100);
	JOptionPane.showMessageDialog(null, "The winning numbers are...");
	JOptionPane.showMessageDialog(null, Number1+", "+Number2+", "+Number3+", "+Number4+", and "+Number5+"!");
}
}
