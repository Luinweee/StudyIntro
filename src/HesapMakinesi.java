import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi1,sayi2,islem;

        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = scan.nextInt();
        System.out.print("\nİşlem türünü seçiniz: ");
        System.out.print("\n1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("\nSeçiminiz: ");
        islem = scan.nextInt();

        if(islem==1) {
            System.out.println("Sonuç: " + (sayi1+sayi2));
        }else if (islem==2) {
            System.out.println("Sonuç: " + (sayi1-sayi2));
        }else if (islem==3) {
            System.out.println("Sonuç: " + (sayi1*sayi2));
        }else if (islem==4) {
            if (sayi2 == 0) {
                System.out.println("2.Sayı 0 olduğu için işlem belirsizdir!");
            }else {
                System.out.println("Sonuç: " + (sayi1 / sayi2));
            }
        }else {
            System.out.println("Geçersiz İşlem!");
        }
    }
}
