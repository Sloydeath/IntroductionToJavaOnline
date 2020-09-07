package by.javaOnline.lesson1.loops.task6;

/*
 Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
*/

public class CharAndNumber {
    public static void main(String[] args) {
        for(int i = 33; i < 127; i++){
            System.out.println(i + " соответствует " + (char)i);
        }
    }
}
