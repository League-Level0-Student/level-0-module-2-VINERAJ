import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("In inches, what is your height?");
	int num = Integer.parseInt(answer);
	if (num>48) {JOptionPane.showMessageDialog(null, "You are eligible to go on the rollercoaster.");}
	else {JOptionPane.showMessageDialog(null, "Grow some more");}

}
}
