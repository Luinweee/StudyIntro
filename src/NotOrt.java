import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quiz, vize, ffinal;
        double ortalama;
        System.out.print("Quiz Notunu Giriniz : ");
        quiz = input.nextInt();
        System.out.print("Vize Notunu Giriniz : ");
        vize = input.nextInt();
        System.out.print("Final Notunu Giriniz : ");
        ffinal = input.nextInt();

        ortalama = (quiz * 0.20) + (vize * 0.35) + (ffinal * 0.45);
        System.out.println("Ortalamanız : " + ortalama);
        String sonuc = (ortalama >= 50) ? "Geçtiniz" : "Kaldınız";
        System.out.println(sonuc);



    }
}

