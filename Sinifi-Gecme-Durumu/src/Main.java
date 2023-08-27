import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //Değişkenler
        int matetmatik, fizik, turkce, kimya,muzik;
        double toplamNot = 0, ort = 0;
        boolean isNot = false;

        //Kullanıcıdan değerleri alalım.
        System.out.print("Matematik notunuzu giriniz : ");
        matetmatik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        // Girilen notarın 100 ve 0 arasında olup olmadığını sorgulayalım.
        if ((matetmatik >=0) && (matetmatik <=100)){
            toplamNot += matetmatik;
        }
        else {
            System.out.println("Geçersiz Matematik notu girdiniz.");
            isNot = true;
        }
        if ((fizik >=0) && (fizik <=100)){
            toplamNot += fizik;
        }
        else {
            System.out.println("Geçersiz Fizik notu girdiniz.");
            isNot = true;
        }
        if ((turkce >=0) && (turkce <=100)){
            toplamNot += turkce;
        }
        else {
            System.out.println("Geçersiz Türkçe notu girdiniz.");
            isNot = true;
        }
        if ((kimya >=0) && (kimya <=100)){
            toplamNot += kimya;
        }
        else {
            System.out.println("Geçersiz Kimya notu girdiniz.");
            isNot = true;
        }
        if ((muzik >=0) && (muzik <=100)){
            toplamNot += muzik;
        }
        else {
            System.out.println("Geçersiz Müzik notu girdiniz.");
            isNot = true;
        }

        //Sınıfı geçme durumunu kontrıol edelim.
        if (isNot == false) {
            ort = toplamNot / 5;

            if (ort >= 55) {
                System.out.print("Tebrikler. Sınıfı " + ort + " ile geçtiniz.");
            } else {
                System.out.print("Sınıfı " + ort + " ile geçemediz.");
            }
        }
        else {
            System.out.print("Hatalı not girdiğiniz için ortalamanız hesaplanmamıştır.");
        }



    }
}