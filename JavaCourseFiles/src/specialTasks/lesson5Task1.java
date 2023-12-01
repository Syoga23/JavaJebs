package specialTasks;

import javax.swing.JOptionPane;

//10.11.23

public class lesson5Task1 {
	public static void main(String[] args) {
		
		int a, b;
		int even = 0;
		int odd = 0;
		
		//В комментариях код для дебаггинга программы
		
		String text = "В массиве - ";
		String debugText = "Массив:";
		
		String size = "×";
		
		try {
		
		size = JOptionPane.showInputDialog("Введите размер массива(a×b):", size);
		
		
		String[] arrayAB = size.split("[ ×*]");
		System.out.print(arrayAB.length);
		
		
		
		if (arrayAB.length<3) {
		a = Integer.parseInt(arrayAB[0]);
		b = Integer.parseInt(arrayAB[1]);
		
		int[][] ArrayOfInts = new int [a][b];
		
		
		for(int i = 0; i < a; i++) {
			debugText += "\n";
		for(int j = 0; j < b; j++) {
			ArrayOfInts[i][j] = (int) (1 + 10*Math.random());
			debugText += ArrayOfInts[i][j] + " ";
			if(ArrayOfInts[i][j] % 2 == 0) {
				even += ArrayOfInts[i][j];
			}else {
				odd += ArrayOfInts[i][j];
			}
		}
		
		}
		
		text += "\nСумма четных чисел - " + even;
		text += "\nСумма нечетных чисел - " + odd;
		
		JOptionPane.showMessageDialog(null, debugText);
		
		JOptionPane.showMessageDialog(null, text);
		
		}else{
			JOptionPane.showMessageDialog(null, "Размер массива задан некорректно!", "Ошибка!",
					JOptionPane.ERROR_MESSAGE);
		 }
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Произошла ошибка при обработке информации:" + e, "Ошибка!",
					JOptionPane.ERROR_MESSAGE);
			
		}
		
	}

}
