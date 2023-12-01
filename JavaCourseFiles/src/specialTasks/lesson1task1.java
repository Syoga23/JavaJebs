package specialTasks;

import java.time.Year;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//13.10.23

public class lesson1task1 {

	static int year;
	static int Age;
	static int month;
	static int day;

	static String fio;
	static String checkX1;
	static String checkX2;

	public static void main(String[] args) {

		int result;

		JTextField quest1 = new JTextField(5);
		JTextField quest2 = new JTextField(5);
		JTextField quest3 = new JTextField(5);
		JTextField quest4 = new JTextField(5);

		JLabel description = new JLabel("Введите личные данные:");

		JPanel Panel1 = new JPanel();

		Panel1.add(description);

		Panel1.add(new JLabel("ФИО:"));
		Panel1.add(quest1);

		Panel1.add(new JLabel("Год рождения:"));
		Panel1.add(quest2);

		Panel1.add(new JLabel("Месяц рождения:"));
		Panel1.add(quest3);

		Panel1.add(new JLabel("День рождения:"));
		Panel1.add(quest4);

		Panel1.setLayout(new BoxLayout(Panel1, BoxLayout.Y_AXIS));

		result = JOptionPane.showConfirmDialog(null, Panel1, "Личные данные пользователя:",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

		JPanel Panel2 = new JPanel();

		Panel2.setLayout(new BoxLayout(Panel2, BoxLayout.Y_AXIS));

		try {
			if (result == 0) { // on OK press

				if (quest1.getText().isBlank() || quest2.getText().isBlank() || quest3.getText().isBlank()
						|| quest4.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Поля не должны быть пустыми, введите данные корректно!",
							"Внимание!", JOptionPane.WARNING_MESSAGE);
					fio = " ";
					Age = 0;
					month = 0;
					day = 0;
					checkX1 = " ";
					checkX2 = " ";
				} else {
					String[] arr = quest1.getText().split(" ");
					fio = arr[0] + " " + arr[1].substring(0, 1) + ". " + arr[2].substring(0, 1) + ".";

					year = Year.now().getValue();
					Age = year - Integer.parseInt(quest2.getText());

					month = Integer.parseInt(quest3.getText());
					checkX1 = month % 2 == 0 ? "-четный." : "-нечетный.";

					day = Integer.parseInt(quest4.getText());
					checkX2 = month % 2 == 0 ? "-четное." : "-нечетное.";
				}

				Panel2.add(new JLabel("ФИО: " + fio));
				Panel2.add(new JLabel("Ваш возраст: " + Age));
				Panel2.add(new JLabel("Ваш месяц рождения: " + month + checkX1));
				Panel2.add(new JLabel("Ваш месяц рождения: " + day + checkX2));
				JOptionPane.showConfirmDialog(null, Panel2, "Ваши данные:", JOptionPane.OK_OPTION,
						JOptionPane.INFORMATION_MESSAGE);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Произошла ошибка при обработке информации:" + e, "Ошибка!",
					JOptionPane.ERROR_MESSAGE);
		}

	}
}
