package Donguler;
import java.util.Scanner;

public class FaizUygulamasi {
    public static void main(String[] args) {
        /*
		 Faiz Uygulaması
		 Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
		 bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.
		 
		 Faiz Oranı : %6 Faiz Oranı
		 
		 */

		Scanner scanner=new Scanner(System.in);
		System.out.println("Bankamıza Hoşgeldiniz. Faiz Oranı %6");
		
		int anapara;
		int vade;
		System.out.print("Yatırmak istediğini tutar : ");
		anapara=scanner.nextInt();
		System.out.print("Paranızı kaç yıl vadeliye yatırmak istiyorsunuz ? :");
		vade=scanner.nextInt();
		
		double toplampara=anapara;
		double faizOranı = 0.06;
		
		for(int i=1;i<=vade;i++) {
			toplampara=(toplampara*faizOranı)+toplampara;
			System.out.println(i+". yılın sonunda toplam para : "+(int)toplampara);
		}
		
    }
}
