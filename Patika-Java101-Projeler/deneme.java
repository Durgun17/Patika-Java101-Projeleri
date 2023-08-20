package Ders;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Haftada kaç gün çalışıyorsunuz? ");
        int gun = input.nextInt();

        if (gun>5){
            System.out.println("Çok verimli");
        } else {
            System.out.println("Az verimli");
        }
        String cevap = (gun>5) ? "Çok önemli" : "Az önemli";
        System.out.println(cevap);
    }
}
