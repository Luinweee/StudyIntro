import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String k_adi,parola;
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        k_adi = scan.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        parola = scan.nextLine();
        if(k_adi.equals("java") && parola.equals("123")){
            System.out.println("Giriş Başarılı!");
        }else {
            System.out.println("Kullanıcı adı veya parolanız hatalı!");
        }
    }
}
