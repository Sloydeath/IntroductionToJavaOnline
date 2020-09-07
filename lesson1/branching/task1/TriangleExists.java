package by.javaOnline.lesson1.branching.task1;

/* Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
         он прямоугольным.*/

public class TriangleExists {
    public static void main(String[] args) {
        int a = 30;
        int b = 90;

        if(a > 0 && b > 0 && a + b < 180){
            if(a == 90 || b == 90 || 180 - (a + b) == 90)
                System.out.println("Треугольник существует и является прямоуголным");
            else
                System.out.println("Треугольник существует, но он не прямоугольный");
        }
        else System.out.println("Такого треуголька не существует");
    }
}
