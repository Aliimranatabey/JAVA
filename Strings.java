public class Strings {
    public static void main(String[] args) {
        String a="JAVA";
		String b="Programlama";
		String c="Dili";
		
		String toplam=a+b+c;
		
		System.out.println("Toplam : "+toplam);
		
		String k="Merhaba";
		int m=35;
		String s=k+m;
		System.out.println(s); // s'i  'Merhaba35' yazdırır
		
		String a1="Merhaba";
		double b1=3.25;
		byte c1=10;
		a=a+b+c;
		System.out.println(a); // a'yı 'Merhaba3.2510' yazdırır 
	
		char a2='?';
		String b2="Merhaba Nasılsın"+a2;
		System.out.println(b2); // Merhaba Nasılsın? ,yazdırır
		
		String a3="Java"+
				"Programlama"+
				"Dili";
		
		String a4="Java\tProgramlama\tDili"; // \t = Bir kere tab tuşuna basmış gibi tab ekler.
		String a5="Java\nProgramlama\nDili"; // \n = Bir kere enter yapmış gibi alt satıra geçer.
		System.out.println("a4 : "+a4);
		System.out.println("a5 : "+a5);
    }
}
