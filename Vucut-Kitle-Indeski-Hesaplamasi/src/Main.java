import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler
        double boy, kilo, indeks;

        //Kullanıcıdan Değişkenleri Alalım
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        //Hesaplama işlemini yapalım
        indeks= kilo / (boy * boy);

        //Sonuçları ekrana yazdıralım
        System.out.print("Vücut Kitle İndeksiniz : " + indeks);

    }
}
