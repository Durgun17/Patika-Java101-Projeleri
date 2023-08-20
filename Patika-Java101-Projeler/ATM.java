package Ders;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user,pass;
        int hak = 3;
        int menu,para,para2;
        int bakiye =1500;

        while (hak>0) {
            System.out.print("Kullanıcı adınız = ");
            user = input.next();
            System.out.print("Şifreniz = ");
            pass = input.next();

            if (user.equals("admin") && pass.equals("admin123")) {
                System.out.print("Merhaba, X bankasına hoş geldiniz! ");

                do {
                    System.out.println("\nYapmak istediğiniz işlemi seçiniz.");
                    System.out.println("\n1- Para yatırmak\n" +
                            "2-Para çekmek\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış");
                    menu= input.nextInt();

                    switch (menu){
                        case 1:
                            System.out.print("Bakiye giriniz = ");
                            para =input.nextInt();
                            bakiye+=para;
                            break;
                        case 2:
                                System.out.print("Bakiye giriniz = ");
                                para2 = input.nextInt();
                                if (para2>bakiye){
                                    System.out.println("Bakiye yetersiz! ");
                                }else {
                                    bakiye-=para2;
                                }
                            break;
                        case 3:
                            System.out.print("Mevcut Bakiyeniz = "+bakiye);
                            break;

                    }

                }while (menu != 4);
                    System.out.println("Tekrar görüşmek üzere !");
                break;

            } else {
                hak--;
                System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz.");

                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Bankanız ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız = " + hak);
                }
            }
        }
    }
}