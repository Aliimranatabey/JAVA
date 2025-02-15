import java.util.Scanner;

public class MetodlaraGiris {

    public static void selamlama(){ //Void: Method tanımlanırken kullanılan void bu methodun herhangi bir değer döndürmeyeceğini ifade etmek için kullanılır. Yani “return” kullanımı söz konusu değildir.
        System.out.println("Merhaba Nasılsınız?");
        System.out.println("Selamlar...");

    }
    public static void faktoriyel(){
        Scanner scanner= new  Scanner(System.in);
        System.out.print("Faktoriyelinin alınmasını istediğiniz bir sayı giriniz: ");
        int sayi=scanner.nextInt();
        int faktoriyel=1;
        System.out.print(sayi+" nın faktoriyeli : ");
        while (sayi>0){
            faktoriyel=faktoriyel*sayi;
            sayi--;
        }
        System.out.println(faktoriyel);
    }
    public static void main(String[] args) {
        /*
         Erişim_Belirleyici(Opsiyonel) Ekstra_Özellikler Dönüş_Tipi Fonksiyon_Adı(Parametreler){
         //Burası Fonksiyon Bloğu
         //Fonksiyonun yapacağı işlemler burada olacak
         }
         */
        System.out.println("Ali");//System paketinin içerisinde out'un içerisindeki println fonksiyonu yardımıyla consola bir çıktı yazdırılır. Yani aslında bu da bir fonksiyondur.
        selamlama();
        faktoriyel();

    }
}
