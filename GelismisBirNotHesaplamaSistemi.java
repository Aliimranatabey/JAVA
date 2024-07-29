import java.util.Scanner;

public class GelismisBirNotHesaplamaSistemi {
    public static void main(String[] args) {
        /*
		   Kullanıcıdan Vize1,Vize2 ve Final notunu alarak bir harf hesaplama sistemi yapmaya çalışın.
		   Ayrıca kullanıcıdan okuldaki genel ortalamasını alarak,
		   DD alma ve 2.50 nin altında olma koşuluna göre ekrana bir tavsiye mesajı yazdırın.
		   
		   Vize1 toplam notun %30'una etki edecek.
		   
		   Vize2 toplam notun %30'una etki edecek.
		   
		   Final toplam notun %40'ına etki edecek.
		   
		   Toplam Not >=90 ----> AA
		   Toplam Not >=85 ----> BA
		   Toplam Not >=80 ----> BB
		   Toplam Not >=75 ----> CB
		   Toplam Not >=70 ----> CC
		   Toplam Not >=65 ----> DC
		   Toplam Not >=60 ----> DD
		   Toplam Not <60 ----> FF
		   
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Vize1 Notunuzu Giriniz : ");
		int vize1=scanner.nextInt();
		System.out.print("Vize2 Notunuzu Giriniz : ");
		int vize2=scanner.nextInt();
		System.out.print("Fianal Notunuzu Giriniz : ");
		int finalNot=scanner.nextInt();
		System.out.print("Okul Ortalamanız : ");
		double ortalama=scanner.nextDouble();
		
		double totalNot=((vize1*3/10.0)+(vize2*3/10.0)+(finalNot*4/10.0));
		if(totalNot>=90) {
			System.out.println("AA");
		}else if(totalNot>=85 && totalNot<90) {
			System.out.println("BA");
		}else if(totalNot>=80 && totalNot<85) {
			System.out.println("BB");
		}else if(totalNot>=75 && totalNot<80) {
			System.out.println("CB");
		}else if(totalNot>=70 && totalNot<75) {
			System.out.println("CC");
		}else if(totalNot>=65 && totalNot<70) {
			System.out.println("DC");
		}else if(totalNot>=60 && totalNot<65) {
			System.out.println("DD");
			if(ortalama<2.50) {
				System.out.println("DD aldınız ve Not ortalamanız düşük. Bu dersi tekrardan almayı düşünebilirsiniz.");
			}
		}else if(totalNot>=0 && totalNot<60) {
			System.out.println("FF");
		}else {
			System.out.println("ERROR");
		}
    }
}
