package by.javaOnline.lesson1.linearPrograms.task4;

/*      ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������). �������� �������
        ������� � ����� ����� ����� � ������� ���������� �������� �����.*/

public class ReverseFractionalNumber {
    public static void main(String[] args) {
        float fractNumber = 353.902F;
        float reverseFractNumber = (fractNumber * 1000 % 1000) + (int)fractNumber / 1000.0F;
        System.out.println(reverseFractNumber);
    }
}
