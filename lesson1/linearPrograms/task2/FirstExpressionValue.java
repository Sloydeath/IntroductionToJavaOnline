package by.javaOnline.lesson1.linearPrograms.task2;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        (b+(b^2+4ac)^1/2)/2a-a^3c+b^-2*/

public class FirstExpressionValue {
    public static void main(String[] args) {
        double a = 1;
        double b = 3.235;
        double c = -1.1231;
        double D = Math.pow(b, 2) + 4 * a * c;
        double firstExpressionValue;

        if (D < 0)
            System.out.println("Нельзя найти корень отрицательного числа");
        else {
            firstExpressionValue = ((b + Math.sqrt(D))/(2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.println(firstExpressionValue);
        }
    }
}
