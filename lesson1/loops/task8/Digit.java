package by.javaOnline.lesson1.loops.task8;

import java.util.Scanner;

/* ���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� � ������� �����. */

public class Digit {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ ����� �����: ");
        a = in.nextInt();
        System.out.println("������� ������ ����� �����: ");
        b = in.nextInt();

        StringBuilder number1 = new StringBuilder(Integer.toString(a));
        StringBuilder number2 = new StringBuilder(Integer.toString(b));

        System.out.print("������ ����� ������� �� ����: ");
        for(int i = 0; i< number1.length(); i++){
            System.out.print(number1.charAt(i) + ". ");
        }
        System.out.println("");
        System.out.print("������ ����� ������� �� ����: ");
        for(int i = 0; i< number2.length(); i++){
            System.out.print(number2.charAt(i) + ". ");
        }
    }
}
