package by.javaOnline.lesson1.loops.task7;

import java.util.Scanner;

/*��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, ����� ������� � ������ �����.
        m � n �������� � ����������.*/

public class Divider {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ ����������");
        m = in.nextInt();
        System.out.println("������� ����� ����������");
        n = in.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.println("�������� ����� " + i + ": ");
            for (int j = 2; j < n; j++) {
                if (i % j == 0 && i != j) {
                    System.out.print(j + " ");
                }
            }
            System.out.println("");
        }
    }
}