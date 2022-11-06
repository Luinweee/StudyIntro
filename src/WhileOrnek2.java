import java.util.Scanner;

public class WhileOrnek2 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
        int i=1,input;
        System.out.print("Faktoriyelini almak istediğiniz sayıyı giriniz: ");
        input = scan.nextInt();
        i=input-1;

        while (i < input && i >= 1) {

            input = input*i;
            i--;

        }
        if (input == 0 || input ==1) {
            input =1;
        }
        System.out.println("Sonuç: " + input);*/

        /*
        int star = scan.nextInt();
        int i = 1;
        while (i <= star) {
            int k = 1;
            while(k <= i) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }*/

        int sayi1,sayi2,sonuc=1;
        System.out.print("Üssü alınacak sayı: ");
        sayi1 = scan.nextInt();
        System.out.print("Üs olacak sayı: ");
        sayi2 = scan.nextInt();

        while (sayi2 >= 1) {
            sonuc = sonuc*sayi1;
            sayi2--;
        }
        System.out.println(sonuc);

    }
}
