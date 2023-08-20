package Ders;

import java.util.Scanner;

public class HormanikSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısınız girini< = ");
        int n = input.nextInt();

        double toplam = 0;

        for (double i = 1 ; i<=n ; i++){
            toplam += (1/i);
        }
        System.out.print(toplam);
    }
}
