package com.company;

public class Main_01_09_2020 {

    public static void main(String[] args) {
        // №1
        System.out.println("Hello World");

        // №2
        int num = 5;
        System.out.println(num);

        // №3
        num = num + 1;
        num += 1;
        System.out.println(num);

        // №4
        int a = 1, b = 2;
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + "; b = " + b);
        // Теперь поменяем обратно
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + "; b = " + b);

        // №5
        int katetA = 5, katetB = 12;
        double gip = Math.pow(katetA*katetA + katetB*katetB, 0.5);
        System.out.println("Гипотенуза = " + gip);

        // №6
        int num1 = 21515;
        System.out.println("Последняя цифра = " + num1 % 10);

        // №7, №8
        int num2 = 53563;
        int num3 = 84;
        System.out.println("Число десятков = " + (num2 / 10) % 10);
        System.out.println("Число десятков = " + (num3 / 10) % 10);

        // №9
        difference(15);
        difference(25);

        // №10
        average_arithmetical(5, 7);

        // №11
        average_geometrical(7, 7);

        // №12
        distance(-2.3, 3, 7, 7);
    }

    // №9
    public static void difference(int num) {
        System.out.println("Разница = " + Math.abs(num - 21));
    }

    // №10
    public static void average_arithmetical(int num1, int num2) {
        System.out.println("Среднее арифметическое = " + (num1 + num2)/2.0);
    }

    // №11
    public static void average_geometrical(int num1, int num2) {
        System.out.println("Среднее геометрическое = " + Math.pow(num1 * num2, 0.5));
    }

    // №12
    public static void distance(double x1, double y1, double x2, double y2) {
        System.out.println("Расстояние между точками = " + Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }

}
