import java.util.Scanner;

public class BedenKitleEndeksi {
    public static void main(String[] args) {
        /* 
		  UYGULAMA
		 	Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle endeksini bulun.
			
			Beden Kitle İndeksi : Kilo/Boy(m)*Boy(m)
		*/

		Scanner scanner=new Scanner(System.in);
		System.out.print("Boyunuzu Girin (Örn: 1,72) : ");
		double size=scanner.nextDouble();
		System.out.print("Kilonuzu Girin : ");
		int kilo=scanner.nextInt();
		
		double bki=kilo/(size*size);
		System.out.println("Beden Kitle Endeksiniz : "+bki);
    }
}
