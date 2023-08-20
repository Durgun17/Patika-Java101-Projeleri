package Ders;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz = ");
        int n = input.nextInt();

        for (int i = n-1; i>= 1; i--){
            for (int k = n; k> i; k--){
                System.out.print(" ");
            }
            for (int l = 1;l<=(2*i-1);l++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
