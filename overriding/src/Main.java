public class Main {
    public static void main(String[] args) {
        BaseKrediManager baseManager=new BaseKrediManager();
        BaseKrediManager ogrenciManager=new OgrenciKrediManager();

        System.out.println(baseManager.Hesapla(10000));
        System.out.println(ogrenciManager.Hesapla(10000));
    }
}