import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Değişkenler
        int km, age, select;
        double price = 0.10, sub, cutPrice = 0, totalSub = 0;
        boolean error = false;

        // Kullanıcıdan değerleri alalım.
        System.out.print("Mesafeyi KM türünden giriniz : ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini seçiniz \n1-Tek Yön\n2-Gidiş Dönüş\n");
        select = input.nextInt();

        //Hesaplama işlemini yapalım
        sub = km * price;

        //Yaş aralığına göre indirim uygulayalım.
        if (km > 0 ){
            if (age > 0) {
                if ((age <= 12)) {
                    cutPrice = sub / 2;
                    sub = cutPrice;
                } else if (age <= 24) {
                    cutPrice = (sub * 90) / 100;
                    sub = cutPrice;
                } else if (age < 65) {
                    cutPrice = sub;
                } else if (age > 65) {
                    cutPrice = (sub * 30) / 100;
                    sub = cutPrice;
                }
            }else {
                    System.out.println("Hatalı yaş girişi yaptınız. Lütfen tekrar deneyin!");
                    error = true;
            }
        }else {
            System.out.println("Hatalı mesafe girişi yaptınız. Lütfen tekrar deneyin!");
            error = true;
        }


       //Yolculuk tipine göre indirim uygulayalım.
        switch (select){
            case 1:
                sub -= totalSub;
                break;
            case 2:
                totalSub = (cutPrice * 20) / 100;
                sub = sub - totalSub;
                sub = 2* sub;
                break;
            default:
                System.out.println("Hatalı yolculuk tipi seçtiniz. Lütfen tekrar deneyin!");
                error = true;
        }

        // Sonuçları ekrana yazdıralım.
        if (!error){
            System.out.println("Toplam ücret " + sub + " TL");
        }
    }
}
