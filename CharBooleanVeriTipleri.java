public class CharBooleanVeriTipleri {
    public static void main(String[] args) {
        // Char veri tipi, karakterleri göstermek için kullanılır. Bellekte 2 byte yer kaplar. 2^16 tane karakter simgelenebelir.
		// Boolean veri tipi, koşul durumlarında kullanılır. True false değeri alır.

		char a='A';
		char b='7';
		char c=1000; // 1000 sayısına karşılık gelen bir karakter mevcuttur.
		char symbol='\u03C8'; //Unicode numarasına göre gelen karakteri değişkene atar
		
		System.out.println("c : "+c+" - symbol :" +symbol);
		
		boolean k=true;
		boolean l=false;
		
		System.out.println(k);
		System.out.println(l);
    }
}
