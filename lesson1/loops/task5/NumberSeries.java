package by.javaOnline.lesson1.loops.task5;

/* ����  ��������  ���  �  ���������  �����  �.  �����  �����  ���  ������  ����,  ������  �������  ������  ���  �����
         ��������� �. ����� ���� ���� ����� ���:
         An = 1/2^n + 1/3^n
         */

public class NumberSeries {
    public static void main(String[] args) {
        double e = 0.1;
        int n = 1;
        double aN = Math.pow((double) 1/2, n) + Math.pow((double) 1/3, n);
        double sum = 0;

        while (Math.abs(aN) >= e) {
            sum += aN;
            n++;
            aN = (1 / Math.pow(2, n)) + (1 / Math.pow((double) 3, n));
        }
        System.out.println("����� ������ ����, ������ ������� ������ ��� ����� ����� " + e + " ����� " + sum);
    }
}
