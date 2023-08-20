import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Değişkenler
        int price;
        double kdv, subPrice;

        // Kullanıcıdan Ürünün Fiyatını Alıyoruz
        System.out.print("Ürün Fiyatını Giriniz = ");
        price = input.nextInt();

        // Ürünün Vergisini Hesaplıyoruz
        if (price > 1000) {
            kdv = price * 0.08;
            subPrice = price + kdv;
            System.out.println("Ürün Fiyatı = " + price);
            System.out.println("KDV Fiyatı = " + kdv);
            System.out.println("KDV'li Ürün Fiyatı = " + subPrice);
        }
        else {
            kdv = price * 0.18;
            subPrice = price + kdv;
            System.out.println("Ürün Fiyatı = " + price);
            System.out.println("KDV Fiyatı = " + kdv);
            System.out.println("KDV'li Ürün Fiyatı = " + subPrice);
        }


    }
}
