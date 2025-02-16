public class Overloading {
    public static void toplama(int a,int b,int c){
        System.out.println("Toplamları : "+(a+b+c));
    }
    public static void toplama(int a,int b){
        System.out.println("Toplamları : "+(a+b));
    }
    public static void toplama(String a,String b){
        System.out.println(a+" "+b);
    }
    public static void skorHesapla(String isim,int puan){
        System.out.println(isim+" adlı oyuncunun "+puan+" puanı var");
    }
    public static void skorHesapla(int puan){
        System.out.println("İsimzsiz oyuncunun "+puan+" puanı var");
    }
    public static void skorHesapla(String isim){
        System.out.println(isim+"adlı oyuncunun hiç puanı yok");
    }
    public static void main(String[] args) {
        toplama(3, 4, 5);
        toplama(3, 4);
        toplama("Ali", "Imran");
        skorHesapla("Ali",1000);
        skorHesapla("Umut");
        skorHesapla(1500);
    }
}
