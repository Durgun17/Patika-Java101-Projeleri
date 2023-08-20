package Ders;

import java.util.Scanner;

public class loginV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int k,toplam= 0;
       do {
           System.out.print("Sayı gitiniz = ");
           k = input.nextInt();
           if (k % 2 == 0){
               toplam+= k;
           }
       }while (k % 2 ==0);

       System.out.print(toplam);

    }
}
