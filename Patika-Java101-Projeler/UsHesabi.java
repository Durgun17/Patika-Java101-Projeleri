package Ders;

import java.util.Scanner;

public class UsHesabi {

    static int uss(int a, int b){
        int toplam= 1;
        for (int i = 1 ; i<=b ; i++){
            toplam *= a;
        }
        return toplam;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayısını girin : ");
        int a= input.nextInt();
        System.out.print("Üs sayısını girin : ");
        int b= input.nextInt();

        System.out.print("Sonuç : "+uss(a,b));

    }
}
