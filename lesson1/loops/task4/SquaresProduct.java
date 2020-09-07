package by.javaOnline.lesson1.loops.task4;

/* Составить программу нахождения произведения квадратов первых двухсот чисел. */

public class SquaresProduct {
    public static void main(String[] args) {
        final long QUINTILLION = 1000000000000000000L;
        long prod = 1;
        int count = 0;
        for(long i = 3; i <= 200; i++) {
            if(prod > QUINTILLION) {
                count++;
                prod -= QUINTILLION;
            }
            prod *= i * i;
        }
        System.out.println("Произведение квадратов первых 200 чисел = " + prod + " + " + count + " * 10^18");
    }
}
