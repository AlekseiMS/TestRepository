package com.test.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class Test1Application {

    public static void main(String[] args) {
        System.out.println("Hello!!!");
        //Сделаем счётчик от 1 до 10
        for (int i = 1; i <= 10; i++)
            System.out.println(i);

        System.out.println("----");

        //В обратном порядке
        for (int j = 10; j > 0; j--)
            System.out.println(j);
    }

}
