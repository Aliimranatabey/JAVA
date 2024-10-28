package Donguler;


import java.util.Scanner;

public class ForDonguleri {
    public static void main(String[] args) {
        /*
		  for (baslatma ; kosul ; artırma veya azaltma işlemleri){
		  		Döngü koşulumuz doğru olduğu sürece burası çalışacak.
		  		}
		 */
		
		int i=0;
		int j=10;
		for(i=0;i<5;i++) {
			System.out.println("i = "+i);
		}
		
		System.out.println("******************");
		
		for(int i2=0;i2<5;i2++) {
			System.out.println("i2 = "+i2);
		}
		
		System.out.println("******************");
		
		for(int i3=10;i3>=0;i3--) {
			System.out.println("i3 = "+i3);
		}
		
		System.out.println("******************");
		
		int i4=0;
		for(i4=0;i4<5;i4++) {
			System.out.println("Java Öğreniyorum...");
		}

		System.out.println("******************");
		
		i=0;
		j=10;
		
		for(;i<10 && j>0 ;i++,j--) {
			System.out.println("i = "+i);
			System.out.println("j = "+j);
		}
		
		System.out.println("******************");
		
		for(int i5=2;i5<100;i5*=2) {
			System.out.println("i5 = "+i5);
		}
		
		System.out.println("******************");
		System.out.println("FAKTORIYEL ISLEMI");
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int faktoriyel=1;
		int number=scanner.nextInt();
		
		for(int i6=1;i6<=number;i6++) {
			faktoriyel=faktoriyel*i6;
			System.out.println("Faktoriyel = "+faktoriyel+" i6 = "+i6);
		}
		
		System.out.println("Faktoriyel : "+faktoriyel);
		
    }
}
