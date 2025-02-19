public class KodBloklarindakiLokalDegiskenler {
    public static void toplama(int a,int b,int c){
        System.out.println(a+b+c);
    }
    //Bir değişken kod bloğu içerisinde tanımlıdır kod bloğu bitince o değişken sonlanır yani bellekten silinir
    public static void main(String[] args) {
        int t=5;
        String yazdir="Merhaba";

        if(t<10){
            int k=5;
            System.out.println(yazdir);
        }
        //System.out.println(b); !HATA VERIR

        for(int i=0;i<10;i++){
            System.out.println(i);
        }

        toplama(3, 4, 6);
       // a=6; //HATA VERIR
    }
}
