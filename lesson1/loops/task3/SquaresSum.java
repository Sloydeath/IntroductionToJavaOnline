package by.javaOnline.lesson1.loops.task3;

 /*����� ����� ��������� ������ ��� �����.*/

public class SquaresSum {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i<=100; i++)
            sum += i*i;
        System.out.println("����� ��������� ������ 100 ����� = " + sum);
    }
}
