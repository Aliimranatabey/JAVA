import java.util.Scanner;

public class YakitTutariHesaplama {
    public static void main(String[] args) {
        /*
		 
		 Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre yol yaptığı 
		 bilgilerini alın ve sürücünün toplam ne kadar ödemesinin gerektiğini 
		 hesaplayın.
		 
		 */

		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Aracınız kilometrede ne kadar yakıyor ? = ");
		double tl=scanner.nextDouble();
		System.out.print("Aracınız kaç kilometre yol yaptı ? = ");
		double km=scanner.nextDouble();
		
		int totalTl=(int)(tl*km);
		System.out.println("Tolam yaktığınız tutar : "+totalTl);
    }
}
