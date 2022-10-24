import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi = scan.nextInt();
        switch (sayi) {
            case 1 -> System.out.println("Sayı : " + sayi);
            case 2 -> System.out.println("Sayı : " + sayi);
            case 3 -> System.out.println("Sayı : " + sayi);
            default -> System.out.println("Geçersiz bir Sayı Giriniz.");
        }
    }
}
