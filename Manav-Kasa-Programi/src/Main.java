import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler
        double priceArmut, priceElma, priceDomates, priceMuz, pricePatlican, total;
        int kgArtmut, kgElma, kgDomates, kgMuz, kgPatlican;

        priceArmut = 2.14;
        priceElma = 3.67;
        priceDomates = 1.11;
        priceMuz = 0.95;
        pricePatlican = 5.00;

        // Kullanıcıdan Değerleri alalım
        System.out.print("Armut kaç kilo = ");
        kgArtmut = input.nextInt();
        System.out.print("Elma kaç kilo = ");
        kgElma = input.nextInt();
        System.out.print("Domates kaç kilo = ");
        kgDomates = input.nextInt();
        System.out.print("Muz kaç kilo = ");
        kgMuz = input.nextInt();
        System.out.print("Patlıcan kaç kilo = ");
        kgPatlican = input.nextInt();

        // Hesaplama işlemini yapalım
        total = (kgArtmut * priceArmut) + (kgElma * priceElma) + (kgDomates * priceDomates) + (kgMuz * priceMuz) + (kgPatlican * pricePatlican);

        // Sonuçları ekrana yazdıralım
        System.out.print("Toplam tutar = " + total);
    }
}





/*
    Manav Kasa Programı
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        Örnek Çıktı;

        Armut Kaç Kilo ? :0
        Elma Kaç Kilo ? :1
        Domates Kaç Kilo ? :1
        Muz Kaç Kilo ? :2
        Patlıcan Kaç Kilo ? :3
        Toplam Tutar : 21.68 TL
*/