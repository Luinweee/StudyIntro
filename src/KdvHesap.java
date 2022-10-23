import java.util.Scanner;

public class KdvHesap {
    public static void main (String[] args) {
        double tutar , kdvliFiyat , kdv = 0.18;

        Scanner input = new Scanner(System.in);

        /*System.out.println("Ürün tutarını giriniz : ");
        tutar = input.nextDouble();
        kdvliFiyat = tutar + (tutar*kdv);
        System.out.println("Kdvli Fiyat : " + kdvliFiyat);*/

        System.out.print("Ürünün kdvli tutarını giriniz : ");
        kdvliFiyat = input.nextDouble();
        tutar = kdvliFiyat / (kdv+1);
        System.out.println("Kdvsiz Tutar : " + tutar);

    }
}
