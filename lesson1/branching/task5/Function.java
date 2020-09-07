package by.javaOnline.lesson1.branching.task5;

 /*��������� �������� �������:
         {x^2 - 3x + 9, ���� x <= 3;
F(x) =   {1/x^3 + 6,    ���� x > 3.*/

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        int x;
        double fx = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("������� �������� x:");
        x = in.nextInt();

        if(x <= 3)
            fx = Math.pow(x, 2) - 3 * x + 9;
        else if(x > 3) //����� �������� ��� ������ � �������� ������ else
            fx = 1/(Math.pow(x, 3) + 6);

        System.out.println("F(x) = " + fx);
        in.close();
    }
}
