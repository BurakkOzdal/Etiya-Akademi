public class Main {
    public static void main(String[] args) {
        String message="bugün hava çok güzel";

        String yeniSehir=sehirler();
        System.out.println(yeniSehir);

        int sayi=topla(1,2);
        System.out.println(sayi);

        int toplam=topla2(1,2,3,4);
        System.out.println(toplam);

    }
    public static void sil(){
        System.out.println("silindi");
    }
    public static void guncelle(){
        System.out.println("güncellendi");
    }
    public static void ekle(){
        System.out.println("eklendi");
    }

    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

    // Variable Arguments
    public static int topla2(int... sayilar){
        int topla=0;
        for(int sayi:sayilar){
            topla+=sayi;
        }
        return topla;
    }


    public static String sehirler(){
        return "İstanbul";
    }

}