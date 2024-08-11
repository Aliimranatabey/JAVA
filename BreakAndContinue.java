import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        /*
		  
		  Break anahtar kelimesi
		  
		  Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman çalışmasını durdurur.
		  Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.
		  
		  Break ifadesi sadce ve sadece içinde bulunduğu döngüyü sonlandırır. Eğer iç içe döngüler varsa 
		  ve içteki döngüde break kullanılmışsa sadece içteki döngü sona erer.
		  
		  Continue anahtar kelimesi
		  
		  Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman geri kalan
		  işlemlerini yapmadan direk döngü bloğunun başına döner
		 
		 */
		
		int i=0;
		while (i<20) {
			if(i==10) {
				break; // i 10 olduğu anda döngü sona erer.
			}
			System.out.println("i : "+i);
			i++;
		}
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.print("Bir İşlem Giriniz : ");
			int islem=scanner.nextInt();
			if(islem==-1){
				System.out.println("Döngüden Çıkılıyor...");
				break;
			}
			System.out.println("İşlem : "+islem);
		}
		
		for(int j=0;j<10;j++) {
			if(j==3 || j==5) {
				continue; // j 3'e veya 5'e eşit ise döngünün geri kalanı çalışmayacaktır. Yani aşağıdaki yazdırma işlemi 3 ve 5 i yazdırmayacaktır.
			}
			System.out.println("j : "+j);
		}
		
		//CONTINUE ile SONSUZ DONGU TEHLİKESİ
		int k=0;
		while(k<10) {
			if(k==3 || k==5) {
				continue; 
			}
			System.out.println("k = "+k);
			k++;
		} // Bu döngü sonsuz döngüye girer çünkü k nın 3 olduğu durumda continue ile döngünün geri kalanı çalışmıyor. Bundan dolayı sürekli k 3 olarak kalacak ve sürekli döngü tekrardan çalışıp continue ile başa dönecektir.
	
		int m=0;
		while(m<10) {
			if(m==3 || m==5) {
				m++;
				continue; 
			}
			System.out.println("m = "+m);
			m++;
		}
    }
}
