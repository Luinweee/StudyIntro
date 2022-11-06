import java.util.Scanner;

public class DoWhileOrnek {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int input,toplam=0;
        do {
            System.out.print("Lütfen sayı giriniz: ");
            input = scan.nextInt();
            if(input%2==0) {
                toplam += input;
            }
        }while(input < 0);

        System.out.println("Girilen çift toplamı: " + toplam);
    }
}
