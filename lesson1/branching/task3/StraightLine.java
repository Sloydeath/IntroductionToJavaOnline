package by.javaOnline.lesson1.branching.task3;

/*Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.*/

public class StraightLine {
    public static void main(String[] args) {
        double x1 = 8;
        double y1 = 4;
        double x2 = 3;
        double y2 = 1.5;
        double x3 = -2;
        double y3 = -1;

        if((x1 - x2) * (y3 - y2) == (x3-x2) * (y1-y2))
            System.out.println("Точки лежат на одной прямой");
        else System.out.println("Точки не лежат на одной прямой");
    }
}
