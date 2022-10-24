import java.util.Scanner;

public class BiletFiyat {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int km,yas,tip;
        double fiyat;

        System.out.print("Mesafeyi Giriniz: ");
        km = scan.nextInt();
        System.out.print("\nYaşınızı Giriniz: ");
        yas = scan.nextInt();
        System.out.print("\nBilet Tipini Seçiniz (1.Tek Gidiş, 2.Gidiş-Dönüş): ");
        tip = scan.nextInt();
        fiyat = km*0.10;
        if (km > 0 && yas > 0 && tip<3 && tip>0) {
            if (tip == 2 && yas < 12) {
                fiyat = fiyat - (fiyat*0.2);
                fiyat = fiyat - (fiyat*0.5);
                System.out.println("Bilet fiyatınız: "+fiyat);
            }else if (tip == 1 && yas < 12) {
                fiyat = fiyat - (fiyat*0.5);
                System.out.println("Bilet fiyatınız: "+fiyat);
            }else if (tip == 2 && yas < 24) {
                fiyat = fiyat - (fiyat*0.2);
                fiyat = fiyat - (fiyat*0.1);
                System.out.println("Bilet fiyatınız: "+fiyat);
            }else if (tip == 1 && yas < 24) {
                fiyat = fiyat - (fiyat*0.1);
                System.out.println("Bilet fiyatınız: "+fiyat);
            }else if (tip == 2 && yas > 65) {
                fiyat = fiyat - (fiyat * 0.2);
                fiyat = fiyat - (fiyat * 0.3);
                System.out.println("Bilet fiyatınız: " + fiyat);
            }else if (tip == 1 && yas > 65) {
                fiyat = fiyat - (fiyat * 0.3);
                System.out.println("Bilet fiyatınız: " + fiyat);
            }

        }else {
            System.out.println("Geçersiz işlem!");
        }
    }
}
