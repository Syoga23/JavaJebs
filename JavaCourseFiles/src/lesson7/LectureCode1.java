package lesson7;

import javax.swing.*;

class MyClass{
int num;
char symb;
String text;
//Конструктор класса с тремя аргументами:
MyClass(int n,char s,String str){
//Заполнение полей:
set(n,s,str);
//Отображение сообщения с информацией об объекте:
showText();
}
void showText(){
	//Локальная текстовая переменная:
	String str="Значения полей объекта:\n";
	//Формирование результата (значения локальной переменной):
	str+="num="+num+"\n";
	str+="symb="+symb+"\n";
	str+="text="+text;

	//Метод отображает окно сообщения:
	JOptionPane.showMessageDialog(null,str);}
	//Метод класса для присваивания значений полям:
	void set(int n,char s,String str){
	// Заполнение полей:
	num=n;
	symb=s;
	text=str;
		}
	}

public class LectureCode1 {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused") MyClass obj=new MyClass(15,'Я',"Привет из 2023.");

	}

}


