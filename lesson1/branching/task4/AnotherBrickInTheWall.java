package by.javaOnline.lesson1.branching.task4;

/*������ ������� �, � �������������� ��������� � ������� �, �, z �������. ����������, ������� �� ������ �����
        ���������.*/

import java.util.Scanner;

public class AnotherBrickInTheWall {
    public static void main(String[] args) {
        double wholeL = 6;
        double wholeW = 4;
        double brickL;
        double brickW;
        double brickH;

        Scanner in = new Scanner(System.in);

        System.out.println("������� ����� �������");
        brickL = in.nextDouble();
        System.out.println("������� ������ �������");
        brickW = in.nextDouble();
        System.out.println("������� ������ �������");
        brickH = in.nextDouble();

        if (brickL <= wholeL && brickW <= wholeW || brickW <= wholeL && brickL <= wholeW ||
                brickL <= wholeL && brickH <= wholeW || brickH <= wholeL && brickL <= wholeW ||
                brickH <= wholeL && brickW <= wholeW || brickW <= wholeL && brickH <= wholeW)
            System.out.println("������ ������� ����� ���������");
        else
            System.out.println("������ �� ������� ����� ���������");
        in.close();
    }
}
