public class MantiksalOperatorler {
    public static void main(String[] args) {
        /*
		 
		  Mantıksal Operatörler
		  && ---> AND operatörü
		  Bütün sonuçlar kendi içinde true ise genel sonuç true, en az birisi bile false ise genel sonuç false olur.
		  
		  || ---> OR operatörü
		  Sonuçlardan en az birisi bile true ise genel sonuç true, hepsi false ise genel sonuç false olur.
		  
		  ! ---> NOT operatörü
		 
		 */
		
		System.out.println(3==3); //TRUE döner
		System.out.println(2>3); //FALSE döner
		System.out.println(2<3); //TRUE döner
		System.out.println("Ali"=="Ali"); //TRUE döner,
		System.out.println("AND operatoru");
		System.out.println(3==3 && 2<3); //TRUE döner
		System.out.println(3==3 && 2>3); //FALSE döner
		System.out.println(3==3 && 2>3 && "Ali"=="Ali"); //FALSE döner
		System.out.println(3==3 && 2<3 && "Ali"=="Ali"); //TRUE döner
		System.out.println("OR operatoru");
		System.out.println(3==3 || 2<3); //TRUE döner
		System.out.println(3!=3 || 2>3); //FALSE döner
		System.out.println(3==3 || 2>3 || "Ali"=="Ali"); //TRUE döner
		System.out.println(3!=3 || 2>3 || "Ali"!="Ali"); //FALSE döner
		System.out.println("NOT operatoru");
		System.out.println(!false); //TRUE döner (bir nevi değilini alıyoruz)
		System.out.println(!(3<4)); //FALSE döner
		System.out.println("Tüm operatorleri birlikte kullanalım");
		System.out.println(!((3<4 && "Ali"=="Ali") || 3.4>2.1)); //FALSE döner
    }
}
