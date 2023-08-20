package Ders;
import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yas,mesafe,ytip;
        double fiyat,fiyat2,fiyat3,inidirim;

        boolean ifError = false;

        System.out.print("Yaşınızı giriniz = ");
        yas = input.nextInt();

        System.out.print("Mesafeyi giriniz (KM cinsinden) = ");
        mesafe = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1-Tek yön / 2- Gidiş-Dönüş) = ");
        ytip = input.nextInt();

        fiyat = mesafe * 0.1;


        if (mesafe<=0){
            System.out.print("Hatalı giriş yaptınız !");
        }else {

            System.out.println("İndirimsiz fiyat = " + fiyat);

            if (ytip == 2) ;
            {
                inidirim = (fiyat * 0.30);
            }

            if (yas <= 12) {
                inidirim = (fiyat * 0.50);
            } else if ((yas > 12) && (yas <= 24)) {
                inidirim = (fiyat * 0.10);
            } else if (yas > 65) {
                inidirim = (fiyat * 0.30);

            }
            if (ytip == 2) {
                fiyat2 = ((fiyat) - (inidirim));
                System.out.println("İndirimli fiyat = " + fiyat2);
            }
        }

    }
}
