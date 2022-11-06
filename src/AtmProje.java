import java.util.Scanner;

public class AtmProje {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bakiye = 1000, input,tutar;

        System.out.println("Merhabalar Zort Banka Hoş Geldiniz !");
        System.out.println("Güncel Bakiyeniz: " + bakiye + " TL");

        while(bakiye >= 0 ) {
            System.out.println("\nYapmak istediğiniz işlemi seçiniz: \n(1-) Para Yatırma\n" +
                    "(2-) Para Çekme\n(3-) Bakiye Sorgulama\n(4-) Çıkış Yapma");
            input = scan.nextInt();
            if (input == 4){
                System.out.print("Çıkış yapılıyor...");
                break;
            }
            else if (input == 1) {
                System.out.println("Yatırmak İstediğiniz Tutarı Giriniz: ");
                tutar = scan.nextInt();
                bakiye = bakiye+tutar;
                System.out.println("Yeni Bakiyeniz: " + bakiye);
            }
            else if (input == 2) {
                System.out.println("Çekmek İstediğiniz Tutarı Giriniz: ");
                tutar = scan.nextInt();
                if (tutar<=bakiye) {
                    bakiye = bakiye-tutar;
                    System.out.println("Paranız Veriliyor. Kalan Bakiyeniz: " + bakiye);
                }else {
                    System.out.println("Yetersiz Bakiye!");
                }
            }
            else if (input == 3) {
                System.out.println("Bakiyeniz: " + bakiye);
            }else {
                System.out.print("Yanlış İşlem Seçimi Tekrar Deneyeniz.");
            }


        }
        System.out.print("\nBizi Tercih Ettiğiniz İçin Teşekkür Eder, İyi Günler Dileriz.");
    }
}
