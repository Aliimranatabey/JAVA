import java.util.Scanner;

public class ScannerDetay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
		scanner.nextLine(); //Dummy (Salakça) Taktik
		String name=scanner.nextLine();
		System.out.println("Yaş: "+age);
		System.out.println("Isim: "+name);

		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		double number3=scanner.nextDouble();
		String name2=scanner.next();
		System.out.println("işlem bitti");
    }
}
