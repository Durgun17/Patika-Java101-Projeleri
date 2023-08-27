import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler
        double number1, number2,total ;
        int select = 0;

        // Kullanıdan sayıları alalım
        System.out.print("1. Sayıyı Giriniz = ");
        number1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz = ");
        number2 = input.nextInt();

        // Kullanıcan yapacağı işlemi öğrenelim
        System.out.print("---------------------\n"+"1-Toplama İşlemi \n2-Çıkartma İşlemi \n3-Çarpma İşlemi \n4-Bölme İşlemi \nYapacağınız işlemi seçiniz =  ");
        select = input.nextInt();

        // Hesaplama işlerimerlini yapalım
        switch (select) {
            case 1:
                total = number1 + number2;
                System.out.print("İşlemin sonucu = " + total);
                break;
            case 2:
                total = number1 - number2;
                System.out.print("İşlemin sonucu = " + total);
                break;
            case 3:
                total = number1 * number2;
                System.out.print("İşlemin sonucu = " + total);
                break;
            case 4:
                total = number1 / number2;
                System.out.print("İşlemin sonucu = " + total);
                break;
            default:
                System.out.print("Hatalı seçim yaptınız !");
                break;
        }
    }
}