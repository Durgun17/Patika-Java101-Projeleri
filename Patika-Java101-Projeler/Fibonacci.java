package Ders;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Sayı giriniz =  ");
        int number = scanner.nextInt();
        int k = 0;
        int a = 1;
        int result = 0;

        System.out.println( number + " Bileşenli Fibonacci serisi:");
        System.out.print("0 1 ");
        for (int i = 0; i < number - 2; i++) {
            result = k + a;
            k = a;
            a = result;
            System.out.print(result + " ");
        }

    }
}
