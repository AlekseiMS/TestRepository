package com.test.test1;

public class Test1Application {

    public static void main(String[] args) {
        System.out.println("Hello!!!");
        //Сделаем счётчик от 1 до 10
        for (int i = 1; i <= 10; i++)
            System.out.println(i);

        System.out.println("----");

        //В обратном порядке
        for (int j = 10; j > 0; j--) {
            //Выведем с помощью метода
            print(j);
        }
        println(""); //Пустая строка
        println("How are you?");
    }

    // Пишем метод для вывода int значения в консоли
    public static void print(int i) {
        System.out.print(i + " ");
    }

    //Пишем метод для вывода String значения в консоли
    public static void println (String s) {
        System.out.println(s);
    }

}
