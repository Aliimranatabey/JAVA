import java.util.Scanner;

public class KosulluDurumlar {
    public static void main(String[] args) {
        
		/*
		 
		  if(koşul) {
		  		Koşul sağlanınca(true) bu blok çalışır
		  }
		  else{
		  		Bu bloğun üstündeki herhangi bir koşul sağlanmadığında bu blok çalışır
		  }
		 
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen Yaşınızı Girin : ");
		int age=scanner.nextInt();
		
		if(age<18) {
			System.out.println("Bu mekana giremezsiniz...");
		}else {
			System.out.println("Hosgeldiniz...");
		}
		
		System.out.println("Bir sayı giriniz : ");
		int number=scanner.nextInt();
		
		if(number<0) {
			System.out.println("Negatif");
		}else {
			System.out.println("Pozitif veya 0");
		}
    }
}
