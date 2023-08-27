import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Değişkenler
        String userName, password, newPassword;
        int select = 0;

        System.out.print("Kullanıcı adınızı giriniz = ");
        userName = input.next();
        System.out.print("Şifrenizi giriniz = ");
        password = input.next();

        if ((userName.equals("patika")) && (password.equals("java123"))){
            System.out.print("Giriş yaptınız...");
        }
        else {
            System.out.print("Hatalı giriş yaptınız.");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? \n1- Evet \n2- Hayır\n");
            select = input.nextInt();

            switch (select){
                case 1:
                    System.out.print("Yeni şifrenizi giriniz = ");
                    newPassword = input.next();

                    if ((newPassword.equals("java123"))){
                        System.out.print("Yeni oluşturduğunuz şifre, eski şifreniz ile aynı olamaz!");
                    }
                    else {
                        System.out.print("Şifreniz güncellenmiştir.");
                    }
                    break;
                case 2:
                    System.out.print("Sayfandan ayrılıyorsunuz, iyi günler...");
                    break;
                default:
                    System.out.print("Hatalı seçim yaptınız.");
            }
        }

    }
}
