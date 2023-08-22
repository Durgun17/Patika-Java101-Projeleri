import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Değişkenler
        int r;
        double pi = 3.14, alan , cevre;

        //Kullanıcıdan r değerini alalım
        System.out.print("Yarı çapı giriniz = ");
        r = input.nextInt();

        //Hesaplama işlemini gerçekleştirelim
        alan = pi * r * r ;
        cevre = 2 * ( pi * r);

        //Sonuçları Ekrana Yazdıralım
        System.out.println("Dairenin alanı = " + alan);
        System.out.println("Dairenin çevresi = " + cevre);
    }
}
