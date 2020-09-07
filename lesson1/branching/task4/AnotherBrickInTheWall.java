package by.javaOnline.lesson1.branching.task4;

/*Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
        отверстие.*/

import java.util.Scanner;

public class AnotherBrickInTheWall {
    public static void main(String[] args) {
        double wholeL = 6;
        double wholeW = 4;
        double brickL;
        double brickW;
        double brickH;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину кирпича");
        brickL = in.nextDouble();
        System.out.println("Введите ширину кирпича");
        brickW = in.nextDouble();
        System.out.println("Введите высоту кирпича");
        brickH = in.nextDouble();

        if (brickL <= wholeL && brickW <= wholeW || brickW <= wholeL && brickL <= wholeW ||
                brickL <= wholeL && brickH <= wholeW || brickH <= wholeL && brickL <= wholeW ||
                brickH <= wholeL && brickW <= wholeW || brickW <= wholeL && brickH <= wholeW)
            System.out.println("Кирпич пройдет через отверстие");
        else
            System.out.println("Кирпич не пройдет через отверстие");
        in.close();
    }
}
