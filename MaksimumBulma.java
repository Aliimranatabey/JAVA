import java.util.Scanner;

public class MaksimumBulma {
    public static void main(String[] args) {
        // Kullanıcıdan alınan 3 sayıdan en büyük sayıyı bulma
		Scanner scanner=new Scanner(System.in);
		System.out.print("1.Sayıyı Giriniz : ");
		int number1=scanner.nextInt();
		System.out.print("2.Sayıyı Giriniz : ");
		int number2=scanner.nextInt();
		System.out.print("3.Sayıyı Giriniz : ");
		int number3=scanner.nextInt();
		
		int maksimum=number1;
		
		if(number2>maksimum) {
			maksimum=number2;
		}else if(number3>maksimum) {
			maksimum=number3;
		}
		
		System.out.println("Girdiğiniz sayıların en büyüğü : "+maksimum);

    }
}
