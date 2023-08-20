package Ders;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int say1,say2,islem;

        System.out.print("Birinci sayıyı giriniz = ");
        say1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz = ");
        say2 = input.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nİşlem seçiniz = ");
        islem = input.nextInt();

        switch (islem){
            case 1:
                System.out.print("Toplam "+(say1 + say2));
                break;
            case 2:
             System.out.print("Çıkartma işlemi "+ (say1 - say2));
                break;
            case 3:
                System.out.print("Çarpma işlemi "+(say1 * say2));
                break;
            case 4:if (say2 != 0) {
                System.out.print("Bölme işlemi " + (say1 / say2));
            }else
                System.out.print("Bir sayı 0' a bölünemez.");
                break;
            default:
                System.out.print("Hatalı işlem seçtiniz.Lütfen tekrar deneyin.");
        }


    }
}
