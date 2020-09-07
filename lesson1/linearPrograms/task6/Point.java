package by.javaOnline.lesson1.linearPrograms.task6;

/* Для данной области (image_task_6_point) составить линейную программу, которая печатает true, если точка с координатами (х, у)
         принадлежит закрашенной области, и false — в противном случае*/

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
