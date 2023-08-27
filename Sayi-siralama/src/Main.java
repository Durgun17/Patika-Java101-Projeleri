import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //Değişkenler
        int number1, number2, number3;

        //kullanıcıdan değerleri alalım.
        System.out.print("1. Sayıyı Giriniz = ");
        number1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz = ");
        number2 = input.nextInt();
        System.out.print("3. Sayıyı Giriniz = ");
        number3 = input.nextInt();

        //Sıralama işlemini yapalım.
        if ((number1 < number2) && (number1 < number3)){
            if (number2 < number3){
                System.out.print(number3 + ">" + number2 + ">" + number1);
            }else {
                System.out.print(number2 + ">" + number3 + ">" + number1);
            }
        } else if ((number2 < number1) && (number2 < number3)) {
            if (number1 < number3){
                System.out.print(number3 + ">" + number1 + ">" + number2);
            }else {
                System.out.print(number3 + ">" + number2 + ">" + number3);
            }
        } else if ((number3 < number1) && (number3 < number2)) {
            if (number1 < number2){
                System.out.print(number2 + ">" + number1 + ">" + number3);
            }else {
                System.out.print(number1 + ">" + number2 + ">" + number3);
            }
        }
    }
}
