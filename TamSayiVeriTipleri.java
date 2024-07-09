public class TamSayiVeriTipleri {
    public static void main(String[] args) {

        //NOT: 	• Byte --> Short --> Integer --> Long

        int s=4;
		System.out.println("Integer Max Value: "+Integer.MAX_VALUE);
		System.out.println("Integer Min Value: "+Integer.MIN_VALUE);
		System.out.println("*************************");
		System.out.println("Byte Max Value: "+Byte.MAX_VALUE);
		System.out.println("Byte Max Value: "+Byte.MAX_VALUE);
		System.out.println("*************************");
		System.out.println("Short Max Value: "+Short.MAX_VALUE);
		System.out.println("Short Max Value: "+Short.MAX_VALUE);
		System.out.println("*************************");
		System.out.println("Long Max Value: "+Long.MAX_VALUE);
		System.out.println("Long Max Value: "+Long.MAX_VALUE);

        short j= 1000;
        int i=(j/2); // buradaki j ifadesi 'short' iken 2 ifadesi 'int' olduğundan hata vermeden sonucu integer dönderir.
    
        //Fakaaaaat!
	
        byte a=100;
        //byte b=(a/2); // buradaki a ifadesi byte  2 ifadesi int olduğundan byte tipindeki b değişkenine integer bir değer atanırsa kayıp olabileceğinden java hata verir.
    
        //Bu hatayı çözebilmek için ;
        byte b=(byte)(a/2); // yazmak gerekir

        short k=100;
        byte l=2;
        int m=4;
        long d=k+l+m;
        System.out.println(d); //Görüldüğü gibi çevirme işleminin soldan sağa olmasından dolayı burada bir hata söz konusu değildir

    }
    
}
