package by.javaOnline.lesson1.linearPrograms.task5;

 /*Дано  натуральное  число  Т,  которое  представляет  длительность  прошедшего  времени  в  секундах.  Вывести
         данное значение длительности в часах, минутах и секундах в следующей форме:
         ННч ММмин SSc.
         */

public class TimeValue {
    public static void main(String[] args) {
        double T = 3600;
        int hour = (int) T/3600;
        int minute = (int) (T - hour * 3600)/60;
        int second = (int) (T - (minute * 60 + hour * 3600));
        System.out.printf("%02dч %02dмин %02dс", hour, minute, second);
    }
}
