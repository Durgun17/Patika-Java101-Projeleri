import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler
        int year;

        //Kullanıcıdan veri alma
        System.out.print("Yılı giriniz : ");
        year = input.nextInt();

        //Hesaplama ve ekrana çıktı verme işlemi.
        if (year % 4 == 0 && year % 100 != 0 ||  year % 400 == 0){
            System.out.print(year + " artık yıldır.");
        }else {
            System.out.print(year + " artık yıl değildir!");
        }

    }
}