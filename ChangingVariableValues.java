import java.util.Scanner;

public class ChangingVariableValues {
    public static void main(String[] args) {
        // Kullanıcıdan aldığınız iki sayının değerlerini değiştirin
		
		Scanner scanner=new Scanner(System.in);
		int number1;
		int number2;
		
		System.out.print("Birinci Sayıyı Giriniz : ");
		number1=scanner.nextInt();
		System.out.print("İkinci Sayıyı Giriniz : ");
		number2=scanner.nextInt();
		
		System.out.println("Degistirme isleminden önce;");
		System.out.println("Birinci Sayı : "+number1+"\nİkinci sayı : "+number2);
		
		int geciciSayi=number1;
		number1=number2;
		number2=geciciSayi;
		
		System.out.println("Degistirme isleminden sonra;");
		System.out.println("Birinci Sayı : "+number1+"\nİkinci sayı : "+number2);
    }
}
