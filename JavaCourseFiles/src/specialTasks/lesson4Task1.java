package specialTasks;

import javax.swing.JOptionPane;

 //3.10.23

public class lesson4Task1 {
	public static void main(String[] args) {
		
		int i = 0;
		int Min = 0, Max = 0;
		int[]  arrayInt = new int[10];
		String input;
		
		while (i<10) {
			input = JOptionPane.showInputDialog(null, "Введите число №" + (i+1) + ":");
			if (input == null) {
				break;
			}
			if (input.isEmpty()) {
				input = "0";
			}
			arrayInt[i] = Integer.parseInt(input);
			//System.out.println("[" + (i+1) + "]:" + arrayInt[i]); debug
			i += 1;
		}
		
		i = 0;
		
		Max = arrayInt[0];
		Min = arrayInt[0];
		
		while (i<10) {
			
			if (Max < arrayInt[i]) {
				Max = arrayInt[i];
			}
			
			if (Min > arrayInt[i]) {
				Min = arrayInt[i];
			}
			
		    i += 1;
		}
			
		if(i == 10) {
		JOptionPane.showMessageDialog(null, "Вы ввели все числа!");
		JOptionPane.showMessageDialog(null, "Из 10 введеных вами чисел:\nМаксимальное значение:"+ Max +"\nМинимальное значение:" + Min);
		}
	}

}
