package by.javaOnline.lesson1.loops.task2;

/*
 Вычислить значения функции на отрезке [а,b] c шагом h:
    { x, x>2;
 y ={
    { -x, x<=2;
*/

import java.util.Scanner;

public class FunctionLoops {
    public static void main(String[] args) {
        int step = 0;
        int a = 0;
        int b = 0;
        int y = 0;

        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введите шаг функции:");
            step = in.nextInt();
            System.out.println("Введите начало отрезка:");
            a = in.nextInt();
            System.out.println("Введите конец отрезка:");
            b = in.nextInt();
        } catch (Exception e){
            System.out.println("Ошибка ввода");
            return;
        } finally {
            in.close();
        }
       if (b - a < 0){
           System.out.println("Начало отрезка не может быть меньше конца. Поменяем значения местами");
           int temp = a;
           a = b;
           b = temp;
       }
       for (int i = a; i <= b; i+=step){
           if (i > 2){
               y = i;
               System.out.println("y = " + y);
           } else if (i <= 2) {
               y = -i;
               System.out.println("y = " + y);
           }
       }
    }
}
