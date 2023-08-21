import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler
        int kenar1, kenar2,kenar3 ,alan,cevre;
        double hipo;

        // Kullanıcıdan Kenar Uzunluklarını Alalım
        System.out.print("Kenar uzunluğunu giriniz = ");
        kenar1 = input.nextInt();
        System.out.print("Kenar uzunluğunu giriniz = ");
        kenar2 = input.nextInt();

        // Hipotenüsü Hesaplayalım
        hipo = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));

        //double türündeki değşkeni int türüne çevirelim
        kenar3 = (int)hipo;

        // Üçgenin Çevresini Hesaplıyalım
        cevre = kenar1 + kenar2 + kenar3;

        // Üçgenin Alanını Bulalım

        alan = kenar1 * kenar2 /2;

        // Değerleri Ekrana Yazdıralım
        System.out.println("Hipotenüs = " + hipo);
        System.out.println("Üçgenin Çevresi = " + cevre);
        System.out.println("Üçgenin Alanı = " + alan);

    }
}

