import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenleri yazalım
        double km, sub ,kmUcreti= 2.20;
        int acilisUcreti = 10;

        //Kullanıcıdan Kilometreyi verisini alalım
        System.out.print("Kilometreyi giriniz = ");
        km = input.nextByte();

        //Ücreti hesaplıyalım
        sub = (km * kmUcreti) + acilisUcreti;

        //İndi-Bindi hesaplaması yapalım
        if (sub < 20) {
            System.out.print("Taksimetre tutarınız 20 TL dir.");
        }
        else {
            System.out.println("Taksimetre tutarınız "+sub + " TL dir.");
        }

    }
}