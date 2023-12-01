package lesson5;

import javax.swing.JOptionPane;

//6.10.23

public class LectureCode2 {
	public static void main(String[] args) {
		
		int n, m;
		
		String text = "Двумерный массив случайных чисел:";
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Строк в массиве:"));
		m = Integer.parseInt(JOptionPane.showInputDialog("Столбцов в массиве:"));
		
		int[][] nums = new int [n][m];
		
		for(int i = 0; i < n; i++) {
			text += "\n";
		for(int j = 0; j < m; j++) {
			nums[i][j] = (int) (10*Math.random());
			text += nums[i][j] + " ";
		}
		
		}
		
		JOptionPane.showMessageDialog(null, text);
	}

}
