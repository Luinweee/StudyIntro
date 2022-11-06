import java.util.Scanner;

public class ReturnVoid {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Sayıyı Giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen Kuvveti Giriniz: ");
        int sayi2 = scan.nextInt();

        int r2 = power(sayi1,sayi2);
        System.out.println("Result: " + r2);
    }
    static int power(int a,int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}
