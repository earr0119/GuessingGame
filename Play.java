import java.util.Scanner;
import javax.swing.JOptionPane;

public class Play {
	public static void main(String[] args) {
		int attemps = 1, userNum, pcNum;
		Scanner in = new Scanner(System.in);

		pcNum = (int) (Math.random() * 100 + 1);
		System.out.println(pcNum);

		JOptionPane.showMessageDialog(null,
				"\n" + "**************************************************************************\n"
						+ "********************Welcome to Our Third Game*********************\n"
						+ "**************************************************************************\n");

		JOptionPane.showMessageDialog(null,
				"This time the challenge will be stronger" + " but I know you are ready!!!");

		JOptionPane.showMessageDialog(null, "I am thinking in a number, \n" + "if you'd to know what number is, \n"
				+ "you have five chance to figure it out");

		do {
			userNum = Integer.parseInt(JOptionPane.showInputDialog("Write your number: "));
			if (userNum == pcNum) {
				JOptionPane.showMessageDialog(null, "Congratulations!!! You did GREAT the number was: " + pcNum);
			} else if (userNum < pcNum) {
				System.out.println("Your number should be High than " + userNum + " Keep Trying");
			} else if (userNum > pcNum) {
				System.out.println("Your number should be Lower than " + userNum + " Keep Trying");
			}
			attemps++;
		} while (attemps <= 5);
		JOptionPane.showMessageDialog(null, "Forgive me but you can not try again the number was: " + pcNum);

	}
}
