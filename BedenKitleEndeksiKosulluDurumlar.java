import java.util.Scanner;

public class BedenKitleEndeksiKosulluDurumlar {
    public static void main(String[] args) {
        /*
		  
		  Kullanıcıdan alınan boy ve kilo değerlerine göre beden kitle endeksini
		  hesaplayın ve şu kurallara göre
		  
		  Beden Kitle İndeksi: Kilo/Boy(m)*Boy(m)
		  
		  BKI 18.5'un altındaysa --------> Zayıf
		  BKI 18.5 ile 25 arasındaysa ---> Normal
		  BKI 25 ile 30 arasındaysa -----> Fazla Kilolu
		  BKI 30'un üstündeyse ----------> Obez 
		  
		 
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Boyunuzu giriniz (örn: 1,72) : ");
		double boy=scanner.nextDouble();
		System.out.print("Kilonuzu giriniz : ");
		int kg=scanner.nextInt();
		
		double bki=kg/(boy*boy);
		
		if(bki<18.5) {
			System.out.println("ZAYIF");
		}else if(bki>=18.5 && bki<25) {
			System.out.println("NORMAL");
		}else if(bki>=25 && bki<30) {
			System.out.println("KİLOLU");
		}else {
			System.out.println("OBEZ");
		}
    }
}
