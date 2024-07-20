import java.util.Scanner;

public class InputAlma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen yaşınızı girin: ");
		int age=scanner.nextInt();
		System.out.println("Yaşınız : "+age);
		
		System.out.println("Lütfen bir double sayı giriniz: "); //virgül ile gir
		double number=scanner.nextDouble();
		System.out.println("Girdiğiniz double sayı: "+number);
		
		System.out.println("Adınızı giriniz: ");
		String name=scanner.nextLine(); //Daha öncesinde bir metin olduğu için direkt atlar
		name=scanner.next();
		System.out.println("İsminiz : "+name);
		
		int number1=scanner.nextInt();
		System.out.println("Sayı1 : "+number1);
		
		//Alınan bir hatanın çözümü if else yapısı ile veya exception ile çözülebilir.
		
		if(scanner.hasNextInt()) {
			int number2=scanner.nextInt();
			System.out.println("Sayı2: "+number2);
		}else {
			System.out.println("Lütfen bir sayı giriniz.");
		}
    }
}
