package Ders;

import java.util.Scanner;

public class CinZotyagi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int dgyil;
        int top;

        System.out.print("Doğum yılınızı giriniz = ");
        dgyil = input.nextInt();

        top = (dgyil % 12);



        switch (top) {
            case 0:
                System.out.println("Maymun halkasındasınız.");
                break;
            case 1:
                System.out.println("Horoz halkasındasınız.");
                break;
            case 2:
                System.out.println("Köpek halkasındasınız.");
                break;
            case 3:
                System.out.println("Domuz halkasındasınız.");
                break;
            case 4:
                System.out.println("Fare halkasındasınız.");
                break;
            case 5:
                System.out.println("Öküz halkasındasınız.");
                break;
            case 6:
                System.out.println("Kaplan halkasındasınız.");
                break;
            case 7:
                System.out.println("Tavşan halkasındasınız.");
                break;
            case 8:
                System.out.println("Ejderha halkasındasınız.");
                break;
            case 9:
                System.out.println("Yılan halkasındasınız.");
                break;
            case 10:
                System.out.println("At halkasındasınız.");
                break;
            case 11:
                System.out.println("Koyun halkasındasınız.");
                break;

        }

    }
}
