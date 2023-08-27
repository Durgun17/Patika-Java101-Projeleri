import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //Değişkenler
        int heat;

        //Kullanıcıdan sıcaklık durumunu alalım
        System.out.print("Sıcaklık derecesini giriniz = ");
        heat = input.nextInt();

        //Sıcaklığa göre etkinlik sorgusunu yapalım
        if (heat < 5){
            System.out.print("Sıcaklık kayak yapmak için uygundur.");
        } else if (heat <15) {
            System.out.print("Sıcaklık Sinamaya gitmek için uygundur.");
        } else if (heat < 25) {
            System.out.print("Sıcaklık Piknik yapmak için uygundur.");
        } else {
            System.out.print("Sıcaklık yüzmek için uygundur.");
        }
    }
}
