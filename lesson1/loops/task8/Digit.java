package by.javaOnline.lesson1.loops.task8;

import java.util.Scanner;

/* Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. */

public class Digit {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        a = in.nextInt();
        System.out.println("Введите второе целое число: ");
        b = in.nextInt();

        StringBuilder number1 = new StringBuilder(Integer.toString(a));
        StringBuilder number2 = new StringBuilder(Integer.toString(b));

        System.out.print("Первое число состоит из цифр: ");
        for(int i = 0; i< number1.length(); i++){
            System.out.print(number1.charAt(i) + ". ");
        }
        System.out.println("");
        System.out.print("Второе число состоит из цифр: ");
        for(int i = 0; i< number2.length(); i++){
            System.out.print(number2.charAt(i) + ". ");
        }
    }
}
