package Ders;

import java.util.Scanner;

public class HesapMakinesiV2 {

    static int top(int a , int b){
        int toplam = a + b;
        System.out.print("Toplam = "+ toplam);
        return toplam;
    }
    static int cik(int a,int  b){
        int toplam = a -b ;
        System.out.print("İşlemin sonucu = "+ toplam);
        return toplam;
    }
    static int carp(int a, int b){
        int toplam = a * b;
        System.out.print("İşlemin sonucu = "+ toplam);
        return toplam;
    }
    static int bol(int a,int b){
        if (b==0){
            System.out.print("Bölme işlemi gerçekleştirilemez.");
            return 1;
        }
        int toplam = a / b;
        System.out.print("İşlemin sonucu = "+toplam);
        return toplam;
    }
    static int us(int a,int b){
        int toplam = 1;
        for (int i= 1 ; i<=b; i++){
            toplam *= a;
        }
        return toplam;
    }
    static int mod(int a,int b){
        return a % b;
    }
    static int dik(int a,int b){
        int alan = a *b ;
        int cevre = 2 * (a + b);
        System.out.print("Alan = "+alan + " Çevre = "+ cevre);
        return alan;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a,b,menu;

        String menu1 = "1- Toplama işlemi \n" +
                "2- Çıkartma işelimi \n" +
                "3- Çarpma işlemi \n" +
                "4- Bölme işlemi \n" +
                "5- Üslü sayı hesaplama işlemi \n" +
                "6- Mod alma işlemi\n" +
                "7- Dikdörtgenin alanını ve çevresini hesaplama işlemi\n" +
                "0- Çıkış";


        System.out.println(menu1);
        while (true) {
            System.out.print("\nYapmak istediğiniz işlemi seçiniz = ");
            menu = input.nextInt();
            if (menu == 0) {
                System.out.println("Tekrardan görüşmek üzere :)");
                break;
            }
            System.out.print("İlk sayıyı giriniz = ");
            a = input.nextInt();
            System.out.print("İkinci sayıyı giriniz = ");
            b = input.nextInt();


            switch (menu) {
                case 1:
                    top(a, b);
                    break;
                case 2:
                    cik(a,b);
                    break;
                case 3:
                    carp(a,b);
                    break;
                case 4:
                    bol(a,b);
                    break;
                case 5:
                    System.out.print("İşlemin sonucu = "+ us(a,b));
                    break;
                case 6:
                    System.out.print("İşlemin sonucu = "+mod(a,b));
                    break;
                case 7:
                    dik(a,b);
                    break;
            }
        }

    }
}
