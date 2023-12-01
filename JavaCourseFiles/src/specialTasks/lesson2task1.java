package specialTasks;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

//20.10.23

public class lesson2task1 {
	public static void main(String[] args) {

		String output = "";
		float radius;
		float volume;
		float mass;

		DecimalFormat df = new DecimalFormat("##.##");
		df.setRoundingMode(RoundingMode.DOWN);

		String answer = JOptionPane.showInputDialog(null, "Введите высоту шара(г/см³): \nМатериал: медь.",
				"Расчет массы и объёма шара:", JOptionPane.QUESTION_MESSAGE);
		if (answer != null) {
			if (answer.isEmpty()) {
				radius = 0.0f;
				JOptionPane.showMessageDialog(null, "Нет радиуса.", "Внимание!", JOptionPane.WARNING_MESSAGE);
			} else {
				radius = Math.abs(Float.parseFloat(answer));
				volume = (float) ((4 / 3) * Math.PI * Math.pow(radius, 3));
				mass = (float) (volume / 8.9);
				output += "Объём шара: " + df.format(volume);
				output += "\nМасса шара: " + df.format(mass);
				JOptionPane.showMessageDialog(null, output, "Расчет:", JOptionPane.INFORMATION_MESSAGE);
			}

		}

	}

}
