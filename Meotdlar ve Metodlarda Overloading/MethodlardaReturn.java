public class MethodlardaReturn {
    /*public static void toplama(int a,int b,int c) { //BU KULLANIM VOID İLE RETURN AYNI METHODDA KULLANILDIGINDAN HATALI BIR KULLANIMDIR VE HATA VERECEKTIR
        return a+b+c;
    }*/
    public static int  toplama(int a,int b,int c) { 
        return a+b+c;
    }
    public static int ikiİleCarp(int a){
        return a*2;
    }
    public static int ikiİleTopla(int a){
        return a+2;
    }
    public static int dortİleCarp(int a){
        return a*4;
    }
  
    public static void main(String[] args) {
        System.out.println(toplama(3, 4, 5));
        System.out.println(dortİleCarp(ikiİleTopla(ikiİleCarp(8))));
    }
}
