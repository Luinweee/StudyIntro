public class DoWhile {
    public static void main(String[] args) {

        int i = 1;
        System.out.println("Döngü Başladı");

        /*
         while (i <=5) {
         (System.out.print(i + ",");
         }
         */
        do {
            System.out.print(i + ",");
            i++;
        } while (i <= 5);
        System.out.println("Döngü Bitti");
    }
}

