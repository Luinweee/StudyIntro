import java.util.Scanner;

public class ForOrnek {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int input;
        boolean asal = true;

        do {
            System.out.print("Lütfen pozitif bir tam sayı giriniz: ");
            input = scan.nextInt();
        }while (input < 2);

        for (int i = 2;i < input; i++) {
            if (input % i == 0) {
                asal = false;
                break;
            }

        }
        if(asal) {
            System.out.print("Girilen sayı: " + input + " asaldır.");
        }else {
            System.out.print("Girilen sayı: " + input + " asal değildir.");
        }
    }
}
