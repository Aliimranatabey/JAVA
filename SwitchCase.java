import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
		 
		 switch(op){
		 		case durum1:
		 			islemler
		 			break
		 		case durum2:
		 			islemler
		 			break;
			 			"
			 			"
			 			"
		 		default:
		 			islemler
		 			break
		
		*/
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Bir işlem giriniz: ");
		int process=scanner.nextInt();
		
		switch(process) {
			case 1:
				System.out.println("1.İşlem");
				// Break yazılmazsa diger koşullara da break görene kadar girer.
			case 2:
				System.out.println("2.İşlem");
				break;
			case 3:
				System.out.println("3.İşlem");
			case 4:
				System.out.println("4.İşlem");
			default:
				System.out.println("Geçersiz İşlem...");
				break;
		}
    }
}
