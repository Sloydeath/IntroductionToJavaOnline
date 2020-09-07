package by.javaOnline.lesson1.branching.task2;

/*Найти max{min(a, b), min(c, d)}.*/

public class maxNum {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = 1;
        int d = 2;
        int minAB = 0;
        int minCD = 0;

        if (a<b)
            minAB = a;
        else if(a>b)
            minAB = b;
        else {
            System.out.println("a и b равны. Берем любое из этих чисел");
            switch ((int)( Math.random() + 1)){
                case 1: minAB = a;
                    break;
                case 2: minAB = b;
                    break;
            }
        }

        if (c<d)
            minCD = c;
        else if(c>d)
            minCD = d;
        else {
            System.out.println("c и d равны. Берем любое из этих чисел");
            switch ((int)( Math.random() + 1)){
                case 1: minCD = c;
                    break;
                case 2: minCD = d;
                    break;
            }
        }

        if(minAB>minCD)
            System.out.println(minAB);
        else if (minAB<minCD)
            System.out.println(minCD);
        else System.out.println("Сравниваемые числа равны");
    }
}


