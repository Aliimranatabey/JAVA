public class KodBloklarindakiLokalDegiskenler {
    //Bir değişken kod bloğu içerisinde tanımlıdır kod bloğu bitince o değişken sonlanır yani bellekten silinir
    public static void main(String[] args) {
        int a=4;
        String yazdir="Merhaba";

        if(a<10){
            int b=5;
            System.out.println(yazdir);
        }
        //System.out.println(b); !HATA VERIR
    }
}
