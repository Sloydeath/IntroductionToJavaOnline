package by.javaOnline.lesson1.linearPrograms.task3;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(sin x + cos x) / (cos x - sin y) * tg xy
*/

public class SecondExpressionValue {
    public static void main(String[] args) {
        double x = 3;
        double y = 6.235231;
        double secondExpressionValue;

        secondExpressionValue = (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
        System.out.println(secondExpressionValue);
    }
}
