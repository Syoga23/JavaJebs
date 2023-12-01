package lesson5;

import javax.swing.JOptionPane;

//6.10.23

public class LectureCode1 {
	
	public static void main(String[] args) {
	int i,size;
	
	String text = "Массив из нечетных чисел\n";
	
	size = Integer.parseInt(JOptionPane.showInputDialog("Укажите размер массива:"));
	
	int[] nums = new int[size];
	
	for(i = 0; i < size; i++) {
		nums[i] = 2 * i + 1;
		text += nums[i] + " ";
	}
	
	JOptionPane.showMessageDialog(null, text);

	}
	
}
