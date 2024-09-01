import java.util.Scanner;

public class WhileileKullaniciGirisKontrolu {
    public static void main(String[] args) {
        // While döngüsü yardımıyla bir kullanıcı girişi yazmaya çalışın
		Scanner scanner=new Scanner(System.in);
		String username="Ali";
		String password="12345";
		int girisHakki=3;
		System.out.println("*******************************");
		System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
		
		while(girisHakki>0) {
			System.out.print("Kullanıcı Adı : ");
			String kullanici=scanner.nextLine();
			System.out.print("Parola : ");
			String parola=scanner.nextLine();
			
			if (parola.equals(password) && kullanici.equals(username)) {
				System.out.println("Hoşgeldiniz...");
				break;
			}else if (parola.equals(password) && !kullanici.equals(username)) {
				System.out.println("Kullanıcı Adınız Yanlış !");
				girisHakki--;
			}else if (!parola.equals(password) && kullanici.equals(username)) {
				System.out.println("Parolanız Yanlış !");
				girisHakki--;
			}else {
				System.out.println("Kullanıcı Adınız ve Parolanız Yanlış !");
				girisHakki--;
			}
			
		}
    }
}
