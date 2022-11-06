import java.util.Scanner;

public class BuyuktenKucuge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.print("1.Sayıyı Giriniz: ");
        a = scan.nextInt();
        System.out.print("2.Sayıyı Giriniz: ");
        b = scan.nextInt();
        System.out.print("3.Sayıyı Giriniz: ");
        c = scan.nextInt();

        if (a>b && a>c) {
            if (b>c) {
                System.out.println("En büyük sayı = " + a + " Ortanca sayı = " + b + " En küçük sayı = " + c);
            }
            else if (b==c) {
                System.out.println("En büyük değer 1.Sayıdır. 2. ve 3. Sayılar birbirine eşittir.");
            }
            else {
                System.out.println("En büyük sayı = " + a + " Ortanca sayı = " + c + " En küçük sayı = " + b);
            }
        }

        else if (b>a && b>c) {
            if (a>c) {
                System.out.println("En büyük sayı = " + b + " Ortanca sayı = " + a + " En küçük sayı = " + c);
            }
            else if (a==c) {
                System.out.println("En büyük değer 2.Sayıdır. 1. ve 3. Sayılar birbirine eşittir.");
            }
            else {
                System.out.println("En büyük sayı = " + b + " Ortanca sayı = " + c + " En küçük sayı = " + a);
            }
        }

        else if (c>a && c>b) {
            if (a>b) {
                System.out.println("En büyük sayı = " + c + " Ortanca sayı = " + a + " En küçük sayı = " + b);
            }
            else if (a==b) {
                System.out.println("En büyük değer 3.Sayıdır. 1. ve 2. Sayılar birbirine eşittir.");
            }
            else {
                System.out.println("En büyük sayı = " + c + " Ortanca sayı = " + b + " En küçük sayı = " + a);
            }
        }

        else {
            System.out.println("Sayılar birbirine eşittir.");
        }

    }
}
