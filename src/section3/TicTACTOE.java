
package section3;

import javax.swing.JOptionPane;

public class TicTACTOE {
	static String xy1 = "1";
	static String turn = "X";
	static String choice;
	static int work = 0;
	static int amount = 0;
	static String xy2 = "2";
	static String xy3 = "3";
	static String xy4 = "4";
	static String xy5 = "5";
	static String xy6 = "6";
	static String xy7 = "7";
	static String xy8 = "8";
	static String xy9 = "9";

	public static void Move(String x1, String x2, String x3, String x4, String x5, String x6, String x7, String x8,
			String x9) {

		choice = JOptionPane.showInputDialog(" " + x1 + " | " + x2 + " | " + x3 + " " + "\n-------\n" + x4 + " | " + x5
				+ " | " + x6 + " " + "\n-------\n" + x7 + " | " + x8 + " | " + x9 + " ");
		if (choice.equals("1")) {
			if (x1.equals("1")) {
				xy1 = turn;
				amount++;
				work = 0;
			} else {
				JOptionPane.showMessageDialog(null, "Somebody already moved there.");
				work = 1;
			}

		}
		if (choice.equals("2")) {
			if (x2.equals("2")) {

				xy2 = turn;
				amount++;

				work = 0;
			} else {
				JOptionPane.showMessageDialog(null, "Somebody already moved there.");
				work = 1;
			}

		}
		if (choice.equals("3")) {
			if (x3.equals("3")) {
				xy3 = turn;
				amount++;
				work = 0;
			} else {
				JOptionPane.showMessageDialog(null, "Somebody already moved there.");
				work = 1;
			}

		}
		if (choice.equals("4")) {
			if (x4.equals("4")) {
				xy4 = turn;
				amount++;

				work = 0;
			} else {
				JOptionPane.showMessageDialog(null, "Somebody already moved there.");
				work = 1;
			}

		}
		if (choice.equals("5")) {
			if (x5.equals("5")) {
				xy5 = turn;
				amount++;
				work = 0;
			} else {
				JOptionPane.showMessageDialog(null, "Somebody already moved there.");
				work = 1;
			}

		}
		if (choice.equals("6")) {
			if (x6.equals("6")) {
				xy6 = turn;
				amount++;
				work = 0;

			} else {
				JOptionPane.showMessageDialog(null, "Somebody already moved there.");
				work = 1;
			}

		}
		if (choice.equals("7")) {
			if (x7.equals("7")) {
				xy7 = turn;
				amount++;

			} else {
				JOptionPane.showMessageDialog(null, "Somebody already moved there.");
				work = 1;
			}

		}
		if (choice.equals("8")) {
			if (x8.equals("8")) {
				xy8 = turn;
				amount++;
				work = 0;

			} else {
				JOptionPane.showMessageDialog(null, "Somebody already moved there.");
				work = 1;
			}

		}

		if (choice.equals("9")) {
			if (x9.equals("9")) {
				xy9 = turn;
				amount++;
				work = 0;

			} else {
				JOptionPane.showMessageDialog(null, "Somebody already moved there.");
				work = 1;
			}

		}
		if (amount > 3) {
			if (xy1.equals(turn) && xy2.equals(turn) && xy3.equals(turn)) {
				amount = 9;
				JOptionPane.showMessageDialog(null, "Player " + turn + " won!");
			}
			if (xy1.equals(turn) && xy4.equals(turn) && xy7.equals(turn)) {
				amount = 9;
				JOptionPane.showMessageDialog(null, "Player " + turn + " won!");
			}
			if (xy4.equals(turn) && xy5.equals(turn) && xy6.equals(turn)) {
				amount = 9;
				JOptionPane.showMessageDialog(null, "Player " + turn + " won!");
			}
			if (xy7.equals(turn) && xy8.equals(turn) && xy9.equals(turn)) {
				amount = 9;
				JOptionPane.showMessageDialog(null, "Player " + turn + " won!");
			}
			if (xy2.equals(turn) && xy5.equals(turn) && xy8.equals(turn)) {
				amount = 9;
				JOptionPane.showMessageDialog(null, "Player " + turn + " won!");
			}
			if (xy3.equals(turn) && xy6.equals(turn) && xy9.equals(turn)) {
				amount = 9;
				JOptionPane.showMessageDialog(null, "Player " + turn + " won!");
			}
			if (xy1.equals(turn) && xy5.equals(turn) && xy9.equals(turn)) {
				amount = 9;
				JOptionPane.showMessageDialog(null, "Player " + turn + " won!");
			}
			if (xy3.equals(turn) && xy5.equals(turn) && xy7.equals(turn)) {
				amount = 9;
				JOptionPane.showMessageDialog(null, "Player " + turn + " won!");
			}
		}
		if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5")
				|| choice.equals("6") || choice.equals("7") || choice.equals("8") || choice.equals("9") && work == 0) {
			if (turn.equals("X")) {
				turn = "O";

			} else {

				turn = "X";
			}
		}

	}

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, " " + xy1 + " | " + xy2 + " | " + xy3 + " " + "\n-------\n" + xy4 + " | "
				+ xy5 + " | " + xy6 + " " + "\n-------\n" + xy7 + " | " + xy8 + " | " + xy9 + " "
				+ "\n This is TicTacToe. Choose the square you want to move in by typing its number (1-9). Press OK to start.");
		while (amount != 9) {
			Move(xy1, xy2, xy3, xy4, xy5, xy6, xy7, xy8, xy9);

		}
		JOptionPane.showMessageDialog(null, " " + xy1 + " | " + xy2 + " | " + xy3 + " " + "\n-------\n" + xy4 + " | "
				+ xy5 + " | " + xy6 + " " + "\n-------\n" + xy7 + " | " + xy8 + " | " + xy9 + " ");

	}
}
