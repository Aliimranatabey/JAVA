import java.util.Scanner;

public class FindHipotenus {
    public static void main(String[] args) {
        //Dik kenarları verilen bir üçgenin hipotenüsünü bulunuz.
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Birinci Dik Kenar Uzunluğunu Giriniz : ");
		int side1=scanner.nextInt();
		System.out.print("Birinci Dik Kenar Uzunluğunu Giriniz : ");
		int side2=scanner.nextInt();
		
		double hipotenus=Math.sqrt((Math.pow(side1, 2))+(Math.pow(side2, 2)));
		System.out.println("Dik Kenarları "+side1+" ve "+side2+" olan bir dik üçgenin hipotenüsü = "+hipotenus+" değeridir.");
    }
}
