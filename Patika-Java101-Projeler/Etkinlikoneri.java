package Ders;
import java.util.Scanner;

public class Etkinlikoneri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int isi;
        System.out.print("Havanın derecesini giriniz = ");
        isi =input.nextInt();

        if (isi < 5){
            System.out.print("Hava kayak yapmak için uygundur.");
        } else if (isi < 25) {
            if (isi <15){
                System.out.print("Hava sinamaya gitmek için uygunudur.\n");
            }if (isi >=10){
                System.out.print("Hava pikniğe gitmek için uygunudur.");
            }
        }else
            System.out.print("Hava yüzmeye gitmek için uygundur.");
    }
}
