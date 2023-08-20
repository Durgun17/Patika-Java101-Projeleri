package Ders;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName,pass,rest;

        System.out.print("Kullanıcı adınızı giriniz = ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi Giriniz = ");
        pass = inp.nextLine();

        if (userName.equals("admin") && pass.equals("java123")){
            System.out.println("Sisteme giriş yaptınız.");
        }else {
            System.out.println("Kullanıcı adı veya şifreniz hatalı.");
            System.out.println("Şifrenizi sıfırlamak istermisiniz? (Evet/Hayır)");
            rest = inp.nextLine();
            if (rest.equals("evet")) {
                System.out.print("Yeni şifrenizi giriniz = ");
                pass = inp.nextLine();
                if (pass.equals("java123"))
                    System.out.println("Şifreniz eskisi ile aynı olamaz");
                System.out.print("Yeni şifreyi tekrar giriniz = ");
                pass = inp.nextLine();
            }else {
                System.out.println("Lütfen şifrenizi tekrar girmeyi deneyin.");
            }
        }
    }
}
