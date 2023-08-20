package Ders;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;

        System.out.println("Sayı giriniz = ");
        int sayi = input.nextInt();

        for (int i = 1; i<=sayi; i++){
            if (sayi%i==0){
                toplam+=i;
            }
        }
        if (toplam/2==sayi){
            System.out.println(sayi+ " Mükemmel sayıdır.");
        }else {
            System.out.println(sayi+ " Mükemmel sayı değildir.");
        }
    }
}
