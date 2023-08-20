package Ders;
import java.util.Scanner;

public class sayi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen bir tammsayı yazın");

        int sayi = input.nextInt();
        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10; //sağdaki basamağı toplama ekle
            sayi=sayi/10; //sağdaki basamağı sil
        }
        System.out.println("Yazdığınız sayının basamakları toplamı="+toplam);

    }
}
