package lesson4;

import javax.swing.JOptionPane;

//30.10.23

public class LectureCode2 {
	public static void main(String[] args) {
		int count, i = 0, j = 0, s1 = 0, s2 = 0;
		
		count = Integer.parseInt(JOptionPane.showInputDialog("Введите границу суммы:"));
		String text = "Сумма натуральных чисел от 1 до " + count + ".\n";
		String str1 = "Оператор while:";
		String str2 = "Оператор do-while:";
		
		while(i <= count) {
			s1 += i;
			i++;
		} 
		do {
			s2 += j;
			j++;
		} while(j <= count);
			
		str1 += s1 + "\n";
	    str2 += s2;
		
		JOptionPane.showMessageDialog(null, text + str1 + str2);
	}

}
