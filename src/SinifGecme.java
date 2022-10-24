import java.util.Scanner;

public class SinifGecme {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int turkce,mat,fenb,sosb,beden;
        double notort;
        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = scan.nextInt();
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = scan.nextInt();
        System.out.print("Fen Bilgileri Notunuzu Giriniz: ");
        fenb = scan.nextInt();
        System.out.print("Sosyal Bilimler Notunuzu Giriniz: ");
        sosb = scan.nextInt();
        System.out.print("Beden Eğitimi Notunuzu Giriniz: ");
        beden = scan.nextInt();
        notort = (turkce+mat+fenb+sosb+beden*1.0)/5;
        if (notort >= 50) {
            System.out.println("Not Ortalamanız: " + notort + " Tebrikler Geçtiniz!");
        }else {
            System.out.println(("Not Ortalamanız: ")+ notort + (" Kaldınız :("));
        }
    }
}
