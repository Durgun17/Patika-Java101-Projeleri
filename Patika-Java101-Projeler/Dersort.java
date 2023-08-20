package Ders;
import java.util.Scanner;

public class Dersort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik,fizik,turkce,kimya,muzik;
        double ort;

        System.out.print("Matematik notunuz = ");
        matematik = input.nextInt();

        System.out.print("Fizik notunuz = ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuz = ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz = ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz = ");
        muzik = input.nextInt();

        ort = (matematik + fizik + turkce + kimya + muzik) / 5 ;

        if (ort < 55){
            System.out.println("Sınıfı geçemediniz.");
        }else {
            System.out.println("Sınıfı başarıyla geçtiniz.");
        }
        System.out.println("Ortalamanız = "+ort);

    }
}
