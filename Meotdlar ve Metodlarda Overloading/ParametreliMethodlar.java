public class ParametreliMethodlar {
    public static void toplama(int a,int b,int c) {
        System.out.println("Toplamları: "+(a+b+c));
    }
    public static void selamlama(String isim){
        System.out.println("Selamlar "+isim);
    }
    public static void main(String[] args) {
        selamlama("Ali İmran");
        selamlama("Ayşe");
        toplama(3,4,5);
        toplama(12,10,20);
    }
}
