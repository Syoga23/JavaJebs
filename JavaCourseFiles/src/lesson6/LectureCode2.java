package lesson6;

import javax.swing.JOptionPane;

//13.10.23

class secondClass{
int num;
char symb;
String text;
// Метод класса:
String showText(){
//Локальная текстовая переменная:
String str = "Значения полей объекта:\n";
//Формирование результата (значения локальной переменной):
str += "num=" + num + "\n";
str += "symb=" + symb + "\n";
str += "text=" + text;
//Метод возвращает значение:
return str;
   }

}

public class LectureCode2 {
	
	public static void main(String[] args) {
		secondClass obj = new secondClass();
		obj.num = 12;
		obj.symb = 'A';
		obj.text = "Текстовое поле";
		JOptionPane.showMessageDialog(null,obj.showText());
	}

}