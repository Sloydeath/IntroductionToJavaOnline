package by.javaOnline.lesson1.linearPrograms.task6;

/* ��� ������ ������� (image_task_6_point) ��������� �������� ���������, ������� �������� true, ���� ����� � ������������ (�, �)
         ����������� ����������� �������, � false � � ��������� ������*/

public class Point {
    public static void main(String[] args) {
        float x = -3f;
        float y = 0f;
        boolean pointIsExists = false;
        if(x>=-2 && x<=2 && y<=4 && y>=0)
            pointIsExists = true;
        else if (x>=-4 && x<=4 && y<=0 && y>=-3)
            pointIsExists = true;

        System.out.println(pointIsExists);
    }
}
