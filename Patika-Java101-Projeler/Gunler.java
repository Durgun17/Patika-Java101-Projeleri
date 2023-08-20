package Ders;

public class Gunler {
    public static void main(String[] args) {
        int day = 54;

        switch (day){
            case 1:
                System.out.print("Bu gün Pazartesi");
                break;
            case 2:
                System.out.print("Bu gün SALI");
                break;
            case 3:
                System.out.print("Bu gün Çarşamba");
                break;
            case 4:
                System.out.print("Bu gün Perşembe");
                break;
            case 5:
                System.out.print("Bu gün Cuma");
                break;
            case 6:
                System.out.print("Bu gün Cumartesi");
                break;
            case 7:
                System.out.print("Bu gün Pazar");
                break;
            default:
                System.out.print("Hatalı giriş yaptınız.");
                break;
        }

    }
}
