package by.javaOnline.lesson1.linearPrograms.task5;

 /*����  �����������  �����  �,  �������  ������������  ������������  ����������  �������  �  ��������.  �������
         ������ �������� ������������ � �����, ������� � �������� � ��������� �����:
         ��� ����� SSc.
         */

public class TimeValue {
    public static void main(String[] args) {
        double T = 3600;
        int hour = (int) T/3600;
        int minute = (int) (T - hour * 3600)/60;
        int second = (int) (T - (minute * 60 + hour * 3600));
        System.out.printf("%02d� %02d��� %02d�", hour, minute, second);
    }
}
