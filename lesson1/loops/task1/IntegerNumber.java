package by.javaOnline.lesson1.loops.task1;

/* Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
         все числа от 1 до введенного пользователем числа.*/

import java.util.Scanner;

public class IntegerNumber {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        try {
            n = in.nextInt();
        } catch (Exception e){
            System.out.println("Ошибка! Вы ввели неверное число");
            return;
        } finally {
            in.close();
        }

        if(n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Сумма чисел = " + sum);
        } else System.out.println("Вы ввели неправильное число (Требуется целое положительное число)");
    }
}
