
package Ders;
import java.util.Scanner;


public class ManavProg {
    public static void main(String[] args) {
        //Değişkenleri oluşturuyoruz.
        double armut,elma,domates,muz,patlıcan,e,a,d,m,p,top;

        //Veri çekme komutu.
        Scanner input = new Scanner(System.in);

        elma = 3.67;
        armut = 2.14;
        domates = 1.11;
        muz = 0.95;
        patlıcan = 5.00;

        System.out.print("Elma kaç kilo = ");
        e = input.nextDouble();
        System.out.print("Armut kaç kilo = ");
        a = input.nextDouble();
        System.out.print("Domates kaç kilo = ");
        d = input.nextDouble();
        System.out.print("Muz kaç kilo = ");
        m = input.nextDouble();
        System.out.print("Patlıcan kaç kilo = ");
        p = input.nextDouble();

        top = e * elma + a * armut + d * domates + m * muz +p * patlıcan;

        System.out.print("Toplam fiyat = "+top);









    }

}
