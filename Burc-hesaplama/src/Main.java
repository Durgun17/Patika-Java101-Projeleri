import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler
        int day, month;

        //Kullanıcıdan değer alma
        System.out.print("Doğduğunuz ayı giriniz = ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz = ");
        day = input.nextInt();

        //Hesaplala işlemini yapalım
        if (month == 1) {
            if ((day > 1) && (day < 22)) {
                System.out.print("Burcunuz : Oğlak");
            } else if (day <= 31) {
                System.out.print("Burcunuz : Kova");
            } else if (day>31) {
                System.out.print("Hatalı gün girdiniz.");
            }
        } else if (month == 2) {
            if (day < 19) {
                System.out.print("Burcunuz : Oğlak");
            } else if ((day >= 20) && day <= 28) {
                System.out.print("Burcunuz : Balık");
            } else if (day>31) {
                System.out.print("Hatalı gün girdiniz.");
            }
        } else if (month == 3) {
            if (day < 20) {
                System.out.print("Burcunuz : Balık");
            } else if ((day >= 21) && day <= 31) {
                System.out.print("Burcunuz : Koç");
            } else if (day>31) {
                System.out.print("Hatalı gün girdiniz.");
            }
        } else if (month == 4) {
            if (day < 20) {
                System.out.print("Burcunuz : Koç");
            } else if ((day >= 21) && day <= 30) {
                System.out.print("Burcunuz : Boğa");
            } else if (day>31) {
                System.out.print("Hatalı gün girdiniz.");
            } else if (month == 5) {
                if (day < 21) {
                    System.out.print("Burcunuz : Boğa");
                } else if ((day >= 22) && day <= 31) {
                    System.out.print("Burcunuz : İkizler");
                }
            } else if (day>31) {
                System.out.print("Hatalı gün girdiniz.");
            }
        } else if (month == 6) {
            if (day < 22) {
                System.out.print("Burcunuz : İkizler");
            } else if ((day >= 23) && day <= 31) {
                System.out.print("Burcunuz : Yengeç");
            } else if (day>31) {
                System.out.print("Hatalı gün girdiniz.");
            }
        } else if (month == 7) {
            if (day < 22) {
                System.out.print("Burcunuz : Yenegç");
            } else if ((day >= 23) && day <= 30) {
                System.out.print("Burcunuz : Aslan");
            } else if (day>31) {
                System.out.print("Hatalı gün girdiniz.");
            }
        }else if (month == 8) {
            if (day < 22) {
                System.out.print("Burcunuz : Aslan");
            } else if ((day >= 23) && day <= 31) {
                System.out.print("Burcunuz : Başak");
            } else if (day>31) {
                System.out.print("Hatalı gün girdiniz.");
            }
        }
        else if (month == 9) {
            if (day < 22) {
                System.out.print("Burcunuz : Başak");
            } else if ((day >= 23) && day <= 30) {
                System.out.print("Burcunuz : Terazi");
            } else if (day>31) {
                System.out.print("Hatalı gün girdiniz.");
            }
        }else if (month == 10) {
            if (day < 22) {
                System.out.print("Burcunuz : Terazi");
            } else if ((day >= 23) && day <= 30) {
                System.out.print("Burcunuz : Akrep");
            } else if (day>31) {
                System.out.print("Hatalı gün girdiniz.");
            }
        }else if (month == 11) {
            if (day < 22) {
                System.out.print("Burcunuz : Akrep");
            } else if ((day >= 22) && day <= 31) {
                System.out.print("Burcunuz : Yay");
            } else if (day>31) {
                System.out.print("Hatalı gün girdiniz.");
            }
        }else if (month == 12) {
            if (day < 21) {
                System.out.print("Burcunuz : Yay");
            } else if ((day >= 22) && day <= 31) {
                System.out.print("Burcunuz : Oğlak");
            } else if (day>31) {
                System.out.print("Hatalı gün girdiniz.");
            }
        } else if ((day >31) || (month >12)) {
            System.out.print("Hatalı ay girdiniz. Lütfen tekrar deneyin.");
        }
    }
}
