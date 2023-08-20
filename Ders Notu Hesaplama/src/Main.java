import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Değişkenler
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;
        double ort;

        // Kullanıcıdan notları alıyoruz
        System.out.print("Matematik notunuzu giriniz = ");
        Matematik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz = ");
        Fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz = ");
        Kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz = ");
        Turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz = ");
        Tarih = input.nextInt();
        System.out.print("Müzik notunuzu giriniz = ");
        Muzik = input.nextInt();

        // Ortalamasını hesaplıyoruz
        ort = (Matematik + Fizik + Kimya + Turkce + Tarih + Muzik) / 6 ;

        // Sınıfı Geçme durumunu kontrol ediyoruz.
        if (ort >60) {
            System.out.print(ort + " ile Sınıfı Geçtiniz, TEBRİKLER");
        }
        else {
            System.out.print(ort + " ile Sınıfta kaldınız.");
        }

    }
}