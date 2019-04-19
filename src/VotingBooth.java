import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("How old are you?(in years)");
	int num = Integer.parseInt(answer);
	if(num>=18) {JOptionPane.showMessageDialog(null, "Who do you want the next president to be?");
	}
	else {JOptionPane.showMessageDialog(null, "No one cares what you think.");}
}
}
