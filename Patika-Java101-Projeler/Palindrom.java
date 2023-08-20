package Ders;

public class Palindrom {

    static boolean isPalin(int sayi){
        int temp = sayi,yeniSayi = 0, sayi2;
        while (temp != 0){
            sayi2 = temp % 10;
            yeniSayi= (yeniSayi * 10 ) + sayi;
            temp /= 10 ;
        }

        if (sayi == yeniSayi){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {

        System.out.println(isPalin(101));

    }
}
