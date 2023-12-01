package specialTasks;

import java.awt.Font;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//27.10.23

public class lesson3Task1 {
	
	static float x1;
	static float x2;
	
	static void showResults(int result) {
		
		DecimalFormat df = new DecimalFormat("##.##");
		df.setRoundingMode(RoundingMode.DOWN);
		
		JPanel Panel2 = new JPanel();
		
		Panel2.setLayout(new BoxLayout(Panel2, BoxLayout.Y_AXIS));
		
		if (result == 2) {
			Panel2.add(new JLabel("X1=" + df.format(x1)));
			Panel2.add(new JLabel("X2=" + df.format(x2)));
			JOptionPane.showConfirmDialog(null, Panel2, "Результаты вычисления корней квадратного уравнения:",
					JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
		}
		
		if (result == 1) {
			Panel2.add(new JLabel("X=" + x1));
			JOptionPane.showConfirmDialog(null, Panel2, "Результаты вычисления корней квадратного уравнения:",
					JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
		}
		
		if (result == 0) {
			Panel2.add(new JLabel("Нет корней."));
			JOptionPane.showConfirmDialog(null, Panel2, "Результаты вычисления корней квадратного уравнения:",
					JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
		}
		
	}

	public static void main(String[] args) {

		int result;

		int A;
		int B;
		int C;
		int Discriminant;
		
		JTextField textFieldA = new JTextField(5);
		JTextField textFieldB = new JTextField(5);
		JTextField textFieldC = new JTextField(5);

		JPanel Panel1 = new JPanel();

		JLabel description = new JLabel("ax²+bx+c=0");
		description.setFont(new Font("Arial", Font.PLAIN, 26));
		Panel1.add(description);

		Panel1.add(new JLabel("Введите коэффициенты, нельзя вводить 0 в коэффициентах."));

		Panel1.add(new JLabel("A:"));
		Panel1.add(textFieldA);

		Panel1.add(new JLabel("B:"));
		Panel1.add(textFieldB);

		Panel1.add(new JLabel("C:"));
		Panel1.add(textFieldC);

		Panel1.setLayout(new BoxLayout(Panel1, BoxLayout.Y_AXIS));

		result = JOptionPane.showConfirmDialog(null, Panel1, "Вычисление корней квадратного уравнения:",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

		if (result == 0) {
			
			if (textFieldA.getText().isEmpty() || textFieldA.getText().equals("0") || textFieldB.getText().isEmpty() || 
					textFieldB.getText().equals("0") || textFieldB.getText().isEmpty() || textFieldB.getText().equals("0")) {
				JOptionPane.showConfirmDialog(null, "Нельзя вводить 0 в коэффициентах или оставлять их пустыми, !", "Внимание:",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
			}else{
				
				A = Integer.parseInt(textFieldA.getText());
				B = Integer.parseInt(textFieldB.getText());
				C = Integer.parseInt(textFieldC.getText());
				
				Discriminant = (int) (Math.pow(B, 2) - 4 * A * C);
				
				if (Discriminant > 0) {
					x1 = (float) ((-B + Math.sqrt(Discriminant))/(2 * A));
					x2 = (float) ((-B - Math.sqrt(Discriminant))/(2 * A));
					showResults(2);
				}
				
				if (Discriminant == 0) {
					x1 = (float) ((-B)/(2 * A));
					showResults(1);
				}
				
				if (Discriminant < 0) {
					showResults(0);
					
				}
				
			}

			


		}

	}

}
