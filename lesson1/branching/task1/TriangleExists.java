package by.javaOnline.lesson1.branching.task1;

/* ���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, � ���� ��, �� ����� ��
         �� �������������.*/

public class TriangleExists {
    public static void main(String[] args) {
        int a = 30;
        int b = 90;

        if(a > 0 && b > 0 && a + b < 180){
            if(a == 90 || b == 90 || 180 - (a + b) == 90)
                System.out.println("����������� ���������� � �������� ������������");
            else
                System.out.println("����������� ����������, �� �� �� �������������");
        }
        else System.out.println("������ ���������� �� ����������");
    }
}
