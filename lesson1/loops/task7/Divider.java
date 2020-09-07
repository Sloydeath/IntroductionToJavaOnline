package by.javaOnline.lesson1.loops.task7;

import java.util.Scanner;

/*ƒл€ каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
        m и n ввод€тс€ с клавиатуры.*/

public class Divider {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите начало промежутка");
        m = in.nextInt();
        System.out.println("¬ведите конец промежутка");
        n = in.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.println("ƒелители числа " + i + ": ");
            for (int j = 2; j < n; j++) {
                if (i % j == 0 && i != j) {
                    System.out.print(j + " ");
                }
            }
            System.out.println("");
        }
    }
}