import java.util.Scanner;

public class ArmstrongSayiBulma {
    public static void main(String[] args) {
        /*
		 	
		 	Girilen bir sayının armstrong sayısını olup olmadığını bulmaya çalışın.
		 	Örneğin 4 basamaklı bir sayının armstrong sayısı olması için şu şartı 
		 	sağlaması gerekmektedir.
		 	1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak sayısı)
		 	371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak sayısı)
		 	
		 	Bu programı do while döngüsü yardımıyla yapabilirsiniz
		 
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Armstrong sayı olup olmadığını merak ettiğiniz sayıyı giriniz.");
		int number=scanner.nextInt();
		int gecici=number;
		System.out.print("Girdiğiniz sayının basamak sayısını girin");
		int bsmksayisi=scanner.nextInt();
		int toplam=0;
		int kalan;
		do{
			kalan=gecici%10;
			toplam+=(int) Math.pow(kalan, bsmksayisi);
			gecici=gecici/10;
		}while(gecici>0);
		
		if(number==toplam) {
			System.out.println("Girdiğiniz Sayı Armstrong Sayıdır NUMBER : "+number+" TOPLAM : "+toplam);
		}else {
			System.out.println("Girdiğiniz Sayı Armstrong Sayı Değildir NUMBER : "+number+" TOPLAM : "+toplam);
		}

    }
}
