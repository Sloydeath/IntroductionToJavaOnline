package by.javaOnline.lesson1.linearPrograms.task4;

/*      ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и целой част€х). ѕомен€ть местами
        дробную и целую части числа и вывести полученное значение числа.*/

public class ReverseFractionalNumber {
    public static void main(String[] args) {
        float fractNumber = 353.902F;
        float reverseFractNumber = (fractNumber * 1000 % 1000) + (int)fractNumber / 1000.0F;
        System.out.println(reverseFractNumber);
    }
}
