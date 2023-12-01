package lesson3;

import javax.swing.JOptionPane;

//23.10.23

public class LectureCode1 {
	public static void main(String[] args) {
		
		String text, str;
		int num;
		
		text = JOptionPane.showInputDialog("Введите целое число от 0 до 10");
		
		if (text.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Вы должны ввести не пустое поле!");
		}else{
			num = Integer.parseInt(text);
			
			switch(num){
			case 0:
				str = "Вы ввели нулевое значение!";
				break;
			case 1:
				str = "Вы ввели единичное значение!";
				break;
			case 2:
			case 3:
			case 5:
			case 7:
				str = "Вы ввели простое число!";
				break;
			case 4:
			case 6:
			case 8:
			case 10:
				str = "Вы ввели четное число!";
				break;
			default:
			str = "Вы ввели число 9 или\nвыходящее за пределы диапазона!";
			
			}
			JOptionPane.showMessageDialog(null, str);
			
		}
		
		
	}

}
