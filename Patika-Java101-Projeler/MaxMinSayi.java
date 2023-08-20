package Ders;
import java.util.Scanner;
public class MaxMinSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Sayitoplam;
        int max= 0;
        int min = 0;

        System.out.print("Kaç adet sayı girmek istediğnizi seçiniz = ");
        Sayitoplam = input.nextInt();

        for (int i= 1; i<=Sayitoplam ; i++){
            System.out.print(i + ". sayıyı giriniz = ");
            int sayi = input.nextInt();

            if (i==1){
                min = sayi;
                max = sayi;
            }if (sayi>=max){
                max=sayi;
            } else if (sayi<=min) {
                min=sayi;

            }
        }
        System.out.println("----------------------");
        System.out.println("En büyük sayı = "+max);
        System.out.println("En küçük sayı = "+min);


    }
}
