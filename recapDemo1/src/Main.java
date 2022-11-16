public class Main {
    public static void main(String[] args) {
      int sayi1=20;
      int say2=22;
      int sayi3=3;
      int enBuyuk=sayi1;

      if (sayi1<say2){
          enBuyuk=say2;
      }
      if (sayi1<sayi3){
          enBuyuk=sayi3;
      }

      System.out.println("En buyuk sayi: "+enBuyuk);

    }
}