package lesson6;

import javax.swing.JOptionPane;

//13.10.23

class firstClass{
	int num;
	char symb;
	String text;
}

public class LectureCode1 {
	public static void main(String[] args) {
		 firstClass obj = new firstClass();
		 // Заполнение полей объекта:
		 obj.num=12;
		 obj.symb='A';
		 obj.text="Текстовое поле";
		 // Текст для отображения в окне сообщения:
		 String str="Значения полей объекта:\n";
		 str+="num="+obj.num+"\n";
		 str+="symb="+obj.symb+"\n";
		 str+="text="+obj.text;
		 // Отображение окна:
		 JOptionPane.showMessageDialog(null,str);
		 
	}
}
