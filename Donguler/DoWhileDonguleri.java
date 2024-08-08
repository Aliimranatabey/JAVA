
import java.util.Scanner;

public class DoWhileDonguleri {
    public static void main(String[] args) {
        /*
		  
		  do{
		  	// Koşul doğru olduğu sürece
		  	// Whiledan farkı en az bir kere çalışmasının garanti olması
		  	
		  	}while(koşul);
		  	
		 */
		
		int i=0;
		do {
			System.out.println("i : "+i);
			i++;
		}while(i<5);
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int number=scanner.nextInt();
		int total=0;
		int kalan=0;
		do {
			kalan=number%10;
			total=kalan+total;
			number=number/10;
			System.out.println("Rakamlar Toplamı = "+total);
		}while(number>=1);
		System.out.println("Rakamlar Toplamı = "+total);
    }
}
