import java.util.Scanner;

public class WhileOrnek {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        int i = 2;
        while (i <= 100) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }*/

        /*
        int deger,toplam = 0;
        while(true) {
            System.out.println("Sayı giriniz: ");
            deger = scan.nextInt();
            if (deger < 0 ) {
                System.out.println("Program bitti. Negatif sayı girdiniz!");
                System.out.print("Girilen tek sayılar toplamı: " + toplam);
                break;
            }
            else if (deger % 2 == 1){
                toplam = toplam+deger;
            }
        }*/

        /*int sayi;
        System.out.println("Bir Sayı Giriniz: ");
        sayi = scan.nextInt();

        while (sayi >= 0) {

            if (sayi < 2) {
                System.out.println("Girilen Sayı 0 ve 1'den büyük olmadılır.");
                break;
            }
            if (sayi % 2 == 1) {
                sayi--;
            }
            if (sayi >= 2) {
                System.out.println("Sonuç: " +sayi);
                sayi=sayi-2;
            }
            if (sayi == 2) {
                System.out.println("Sonuç: " +sayi);
                break;

            }
        }*/


    }
}
