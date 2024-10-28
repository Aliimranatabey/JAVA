package Donguler;

import java.util.Scanner;

public class WhileDonguleri {
    public static void main(String[] args) {
        /*
		  
		  while(dongu kosulu){
		  		// Kosul dogru oldugu surece calisir.
		  }
		  
		 */

		int i=0;
		
		//Aşağıdaki Kod Sonsuz Döngüye girmemize sebep olur
		/*while(i<10) {
			System.out.println("i : "+i);
		}*/
		
		while(i<10) {
			System.out.println("i : "+i);
			i++;
		}
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int number=scanner.nextInt();
		int faktoriyel=1;
		
		while(number>0) {
			faktoriyel=faktoriyel*number;
			number--;
		}
		
		System.out.println("Faktoriyel : "+faktoriyel);
		
    }
}
