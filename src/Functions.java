public class Functions {
    public static void main(String[] args) {
        f(4);
        power(2,3);

    }
    static void f(int x) {
        int result = (x + 2) * 6;
        System.out.println("Sonuç: " + result);
    }
    static void power(int numb1,int numb2) {
        int result = 1;
        for (int i = 1; i <= numb2; i++) {
            result *= numb1;
        }
        System.out.println("Sonuç: " + result);

    }
}
