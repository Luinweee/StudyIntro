import java.util.Scanner;

public class ForArmstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp,bir,on,yuz,toplam;
        for (int i = 100; i <= 999; i++) {
            temp = i;

            bir = temp %10;
            temp /=10;

            on = temp %10;
            temp /=10;

            yuz = temp %10;
            temp /=10;

            toplam = (bir * bir * bir) + (yuz * yuz * yuz) + (on * on * on);

            if (toplam == i) {
                System.out.println(i + " bir Armstrong sayıdır.");
            }
        }


    }
}
