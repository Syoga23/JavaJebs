package specialTasks;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//20.10.23

public class lesson2Task2 {

	static JPanel Panel2 = new JPanel();

	static void showAnswer(boolean state, String text) {
		JLabel result = new JLabel();
		if (state) {
			result.setText("Вы ответили правильно(" + text + ")");
		} else {
			result.setText("Вы ответили неправильно(" + text + ")");
		}
		Panel2.add(result);

	}

	public static void main(String[] args) {

		int result;
		
		String answer1 = "Прометей";
		String answer2 = "18";
		String answer3 = "Н2О";
		String answer4 = "Земля";
		String answer5 = "Млечный путь";

		JTextField quest1 = new JTextField(5);
		JTextField quest2 = new JTextField(5);
		JTextField quest3 = new JTextField(5);
		JTextField quest4 = new JTextField(5);
		JTextField quest5 = new JTextField(5);

		JPanel Panel1 = new JPanel();

		Panel1.add(new JLabel("Как называли бога подарившего знания людям?"));
		Panel1.add(quest1);

		Panel1.add(new JLabel("2*9=?"));
		Panel1.add(quest2);

		Panel1.add(new JLabel("Химическая формула молекулы воды?"));
		Panel1.add(quest3);

		Panel1.add(new JLabel("На какой планете ты живёшь?"));
		Panel1.add(quest4);

		Panel1.add(new JLabel("Как называется галактика в которой ты живёшь?"));
		Panel1.add(quest5);

		Panel1.setLayout(new BoxLayout(Panel1, BoxLayout.Y_AXIS));

		result = JOptionPane.showConfirmDialog(null, Panel1, "Угадайка:", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE);

		Panel2.setLayout(new BoxLayout(Panel2, BoxLayout.Y_AXIS));

		if (result == 0) { // on OK press

			if (quest1.getText().equals(answer1)) {
				showAnswer(true, answer1);
			} else {
				showAnswer(false, answer1);
			}

			if (quest2.getText().equals(answer2)) {
				showAnswer(true, answer2);
			} else {
				showAnswer(false, answer2);
			}

			if (quest3.getText().equals(answer3)) {
				showAnswer(true, answer3);
			} else {
				showAnswer(false, answer3);
			}

			if (quest4.getText().equals(answer4)) {
				showAnswer(true, answer4);
			} else {
				showAnswer(false, answer4);
			}

			if (quest5.getText().equals(answer5)) {
				showAnswer(true, answer5);
			} else {
				showAnswer(false, answer5);
			}

			JOptionPane.showConfirmDialog(null, Panel2, "Ответы:", JOptionPane.OK_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
