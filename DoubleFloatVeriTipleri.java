public class DoubleFloatVeriTipleri {
    public static void main(String[] args) {
        //Double : 64 bit - 8 byte
		//Float : 32 bit - 4 byte
		
		// Otomatik Donusturme: int --> float --> double
		
		double a=5.25;
		double b=4.0;
		double c=4d;
		double d=4.23d;
		
		System.out.println("a : "+a+" - b : "+b+" - c : "+c+" - d : "+d);
		
		//float k=5.0; // Hata verir çünkü bu bir double tanımlamadır
		float k=(float)5.0;
		float l=5f;
		float m=5.2f;
		
		int s=22/7;
		float t=22f/7f;
		double y=22d/7d;
		
		System.out.println("s : "+s); // s : 3
		System.out.println("t : "+t); // t : 3.142857
		System.out.println("y : "+y); // y : 3.142857142857143
	
		double sayi1=70.25;
		double sayi2=60d;
		double sayi3=80.2;
		
		float sayi4=70.25f;
		float sayi5=60f;
		float sayi6=80.2f;
		
		System.out.println("Ortalama : "+(sayi1+sayi2+sayi3)/3);
		System.out.println("Ortalama : "+(sayi4+sayi5+sayi6)/3);
    }
}
