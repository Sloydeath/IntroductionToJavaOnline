package by.javaOnline.lesson1.branching.task3;

/*���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������.*/

public class StraightLine {
    public static void main(String[] args) {
        double x1 = 8;
        double y1 = 4;
        double x2 = 3;
        double y2 = 1.5;
        double x3 = -2;
        double y3 = -1;

        if((x1 - x2) * (y3 - y2) == (x3-x2) * (y1-y2))
            System.out.println("����� ����� �� ����� ������");
        else System.out.println("����� �� ����� �� ����� ������");
    }
}
