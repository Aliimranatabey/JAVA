import java.util.Scanner;

public class KosulluDurumlar2 {
    public static void main(String[] args) {
        /*
		 
		 
		  if(koşul) {
		  		Koşul sağlanınca(true) bu blok çalışır
		  }
		  else if(başka bir koşul) {
		  		Bu Koşul sağlanınca(true) bu blok çalışır
		  }
		  else if(başka bir koşul) {
		  		Bu Koşul sağlanınca(true) bu blok çalışır
		  }
					  ""
					  ""
					  ""
					  ""
		  else{
		  		Bu bloğun üstündeki herhangi bir koşul sağlanmadığında bu blok çalışır
		  }
		 
		*/
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Bir islem giriniz : ");
		int process=scanner.nextInt();
		
		if(process==1) {
			System.out.println("1. İşlem");
		}else if(process==2){
			System.out.println("2. İşlem");
		}else if(process==3) {
			System.out.println("3. İşlem");
		}else if(process==4) {
			System.out.println("4. İşlem");
		}else {
			System.out.println("Geçersiz İşlem...");
		}
		
		System.out.println("Lütfen notunuzu giriniz : ");
		int not=scanner.nextInt();
		
		
		//Aşagıdaki örnekte else if yerine tüm koşulların if ile olduğunu düşünelim. 
		//Böyle bir durumda girilen değeri sağlayan bütün if koşulları çalışır.
		if(not>=90) {
			System.out.println("AA");
		}else if(not>=85){
			System.out.println("BA");
		}else if(not>=80) {
			System.out.println("BB");
		}else if(not>=75) {
			System.out.println("CB");
		}else if(not>=70){
			System.out.println("CC");
		}else if(not>=65) {
			System.out.println("DC");
		}else if(not>=60) {
			System.out.println("DD");
		}else {
			System.out.println("Dersten Kaldınız...");
		}
    }
}
