package lesson1;

import javax.swing.*;

//9.10.23

public class LectureCode1 {
	public static void main(String[] args) {

		String fullName = "Слепцов Сергей Николаевич";
		int age = 20;
		String group = "АТП-21";
		String facultet = "ФТИ";
		int kurs = 3;
		int semestr = 1;

		String text = "Студент: " + fullName + ".";

		text = text + "\n" + "Возраст: " + age + " лет.";
		text = text + "\n" + "Группы: " + group + " " + kurs + " курс " + semestr + " семестр.";
		text = text + "\n" + "Факультет: " + facultet + ".";

		JOptionPane.showMessageDialog(null, text);

	}

}
