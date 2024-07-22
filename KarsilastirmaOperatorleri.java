public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        /*
		 
		 Karşılaştırma Operatörleri
		 
		 == ---> Eşit mi ?
		 != ---> Eşit Değil mi ?
		 >  ---> Büyük mü ?
		 <  ---> Küçük mü ?
		 >= ---> Büyük veya eşit mi ?
		 <= ---> Küçük veya eşit mi ?
		 
		 */
		
		System.out.println(3 == 3); //TRUE döner
		System.out.println(4 == 3); //FALSE döner
		System.out.println(3 != 3); //FALSE döner
		System.out.println(4 != 3); //TRUE döner
		System.out.println(2 > 3); //FALSE döner
		System.out.println(2 > 1); //TRUE döner
		System.out.println(2 < 3); //TRUE döner
		System.out.println(2 < 1); //FALSE döner
		System.out.println(2 <= 3); //TRUE döner
		System.out.println(2 <= 2); //TRUE döner
		System.out.println(2 <= 1); //FALSE döner
		System.out.println(2 >= 3); //FALSE döner
		System.out.println(2 >= 2); //TRUE döner
		System.out.println(2 >= 1); //TRUE döner
		System.out.println("Ali"=="Ali"); //TRUE döner
		System.out.println("Ali"!="Ali"); //FALSE döner
		System.out.println("Veli"!="Ali"); //TRUE döner
		//System.out.println("Ali">"Ali"); //Hata verir
    }
}
