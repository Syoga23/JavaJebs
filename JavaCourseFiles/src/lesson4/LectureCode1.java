package lesson4;

import javax.swing.JOptionPane;

//30.10.23

public class LectureCode1 {
	public static void main(String[] args) {
		int count, s = 0;
		
		count = Integer.parseInt(JOptionPane.showInputDialog("Введите границу суммы:"));
		String text = "Сумма натуральных чисел от 1 до " + count + ": ";
		
		for (int i = 1; i <= count; i++) {
			s += i;
		}
		JOptionPane.showMessageDialog(null, text + s);
	} 

}
