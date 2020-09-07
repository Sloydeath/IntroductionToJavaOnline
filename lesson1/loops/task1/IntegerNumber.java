package by.javaOnline.lesson1.loops.task1;

/* �������� ���������, ��� ������������ ������ ����� ����� ������������� �����. � ��������� ���������
         ��� ����� �� 1 �� ���������� ������������� �����.*/

import java.util.Scanner;

public class IntegerNumber {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("������� ����� ����� ������������� �����");
        try {
            n = in.nextInt();
        } catch (Exception e){
            System.out.println("������! �� ����� �������� �����");
            return;
        } finally {
            in.close();
        }

        if(n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("����� ����� = " + sum);
        } else System.out.println("�� ����� ������������ ����� (��������� ����� ������������� �����)");
    }
}
