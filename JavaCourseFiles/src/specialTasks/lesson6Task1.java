package specialTasks;

import javax.swing.JOptionPane;

//24.11.23

/*
 Напишите программу и создайте свой класс для хранения данных о собаках. 
 Пользователь в диалоговом окне вводит следующую информацию о 2 собаках 
 (о матери и щенке): кличка, возраст, окрас, порода. Далее программа создает 
 2 объекта вышеуказанного класса для каждой собаки и записывает эти данные в
  поля объектов, которые заранее создаются в классе. Затем выводится на печать 
  значение полей созданных объектов т.е. о собаках поочередно в формате:

-----------------------
Собака №1, 2
Кличка : __
Возраст : ___
Окрас : ___
Порода : ___
-----------------------

 */

public class lesson6Task1 {
	
	static int count;
	static String text = "";
	
	public static void fillInputDogData(Dog obj, boolean reset) {
		
		count += 1;
		
		String temp = "Собака №";
		
		try {
		obj.name = JOptionPane.showInputDialog(null, "Введите кличку собаки:",
				temp + count, JOptionPane.QUESTION_MESSAGE);
		obj.age = Integer.parseInt(JOptionPane.showInputDialog(null, "Введите возраст собаки:",
				temp + count, JOptionPane.QUESTION_MESSAGE));
		obj.dye = JOptionPane.showInputDialog(null, "Введите окрас собаки:", 
				temp + count, JOptionPane.QUESTION_MESSAGE);
		obj.breed = JOptionPane.showInputDialog(null, "Введите породу собаки:",
				temp + count, JOptionPane.QUESTION_MESSAGE);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Не оставляйте строки пыустыми и не выходите из программы, не заполнив поля!" + e, "Ошибка!", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		if(reset) {
			count = 0;
		}
		
	}
	
	
	public static void showDogData(Dog obj, boolean reset) {
		
		count += 1;
		text = "";
		
	    text += "Собака №" + count + ":\n";
		text += "Кличка: " + obj.name + "\n";
		text += "Возраст: " + obj.age + "\n";
		text += "Окрас: " + obj.dye + "\n";
		text += "Порода: " + obj.breed + "\n";
		
		JOptionPane.showMessageDialog(null, text);
		
		if(reset) {
			count = 0;
		}
		
	}
	
	
	public static void main(String[] args) {
		Dog mother = new Dog();
		Dog puppy = new Dog();
		
		fillInputDogData(mother, false);
		fillInputDogData(puppy, true);
		
		showDogData(mother, false);
		showDogData(puppy, true);
		
	}

}
