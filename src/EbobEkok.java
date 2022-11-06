import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s1,s2,ebob = 1,ekok;
        System.out.print("Lütfen Sayıları Giriniz: ");
        s1 = scan.nextInt();
        s2 = scan.nextInt();

        int min = Math.min(s1, s2);

        for (int i = min; i > 0; i--) {

            if ((s1 % i == 0) && (s2 % i == 0)) {
                ebob = i;
                break;
            }
        }

        ekok = (s1*s2) / ebob;
        System.out.print("Ebob: " + ebob + " Ekok: " + ekok);
    }
}
