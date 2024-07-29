import java.util.Scanner;

public class SwitchCaseHesapMakinesi {
    public static void main(String[] args) {
        // Switch Case kullanarak 4 işlem yapan bir hesap makinesi tasarlamaya çalışın
		
		Scanner scanner=new Scanner(System.in);
		String process="1. TOPLAMA + \n"
				+ "2. CIKARMA - \n"
				+ "3. CARPMA - \n"
				+ "4. BOLME - \n";
		System.out.println(process);
		System.out.println("********************************");
		System.out.println("İŞLEMİ SEÇİN :");
		String islem=scanner.nextLine();
		int number1;
		int number2;
		switch(islem) {
			case "1":
				System.out.print("Birinci Sayı: ");
				number1=scanner.nextInt();
				System.out.print("İkinci Sayı: ");
				number2=scanner.nextInt();
				System.out.print("GİRİLEN DEĞERLERİN TOPLAMLARI = "+(number1+number2));
				break;
			case "2":
				System.out.print("Birinci Sayı: ");
				number1=scanner.nextInt();
				System.out.print("İkinci Sayı: ");
				number2=scanner.nextInt();
				System.out.print("GİRİLEN DEĞERLERİN FARKLARI = "+(number1-number2));
				break;
			case "3":
				System.out.print("Birinci Sayı: ");
				number1=scanner.nextInt();
				System.out.print("İkinci Sayı: ");
				number2=scanner.nextInt();
				System.out.print("GİRİLEN DEĞERLERİN CARPIMLARI = "+(number1*number2));
				break;
			case "4":
				System.out.print("Birinci Sayı: ");
				number1=scanner.nextInt();
				System.out.print("İkinci Sayı: ");
				number2=scanner.nextInt();
				System.out.print("GİRİLEN DEĞERLERİN BOLUMU = "+(double)(number1/number2));
				break;
			default:
				System.out.println("GEÇERSİZ İŞLEM");
		}
    }
}
