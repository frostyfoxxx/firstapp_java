package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String hello = "Hello";
        System.out.println(hello + ", World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        // if
//        int x = 10;
//        int y = 20;
//        if (x < y) {
//            System.out.println("ЫЫЫ");
//        }

        // for
        int it;
        for (it = 0; it < 10; it = it + 1) {
            System.out.println("Х = " + it);
        }

//        Scanner numeric = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        int num = numeric.nextInt();
//        System.out.println("Ввведенное число равно: " + num);
//        numeric.close();

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите имя: ");
//        String name = in.nextLine();
//        System.out.print("Введите возраст: ");
//        int age = in.nextInt();
//        System.out.print("Введите рост: ");
//        float height = in.nextFloat();
//        System.out.printf("Имя: %s  Возраст: %d  Рост: %.2f \n", name, age, height);
//        in.close();

//        if-else-if
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        byte month = in.nextByte();
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зиме";
                break;
            case 3:
            case 4:
            case 5:
                season = "весне";
                break;
            case 6:
            case 7:
            case 8:
                season = "лету";
                break;
            case 9:
            case 10:
            case 11:
                season = "осени";
                break;
            default:
                season = "вымышленным месяцам";
        }

        System.out.println("Апрель относится к " + season + ".");

    }
}
