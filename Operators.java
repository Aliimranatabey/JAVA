public class Operators{
    public static void main(String[] args) {
        /*
		 + ---> Toplama Operatörü
		 - ---> Çıkarma Operatörü
		 / ---> Bölme Operatörü
		 * ---> Çarpma Operatörü
		 % ---> Kalan Operatörü
		 */
		
		System.out.println(3+4.2); //double şekilde sonuç çıkarır.
		System.out.println(3-5f); //float şekilde sonuç çıkarır.
		System.out.println(10d/4); //double şekilde sonuç çıkarır.
		System.out.println(3*4);
		System.out.println(10%4);
		
		int a=4; //Atama operatörü '='
		a=a+2;
		a-=7;
		System.out.println(a);
		int b=6;
		b=b*3;
		b*=4;
		System.out.println(b);

		int c=5;
		c--; //c yi 1 azalt
		c++; //c yi 1 arttır
		c++; //POSTFIX Gosterim
		--c; //PREFIX Gosterim
		System.out.println(c);
		
		//POSTFIX PREFIX FARKI
		int k=7;
		System.out.println(k++); //POSTFIX: Önce Güncellenmeyen değer ekrana yazılır ve sonra arttırılır
		k=7;
		System.out.println(++k); //PREFIX: Önce arttırılır ve Güncellenen değer ekrana yazılır
		 
    }
}