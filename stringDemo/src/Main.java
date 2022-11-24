public class Main {
    public static void main(String[] args) {
        String message="Bugün hava çok güzel.";
        System.out.println(message);

        System.out.println("Eleman sayısı: "+message.length());

        //İstenilen index numaralı elemanı almak için 'charAt'
        System.out.println("5. Eleman: "+message.charAt(4));

        // Stringleri birleştirmek için 'concat'
        System.out.println(message.concat(" Yaşasın!"));

        //Metin istenilen değerle mi başlıyor 'startWith' boolean döner
        System.out.println(message.startsWith("B"));

        //Metin istenilen değeler mi bitiyor 'endWith' boolean döner
        System.out.println(message.endsWith("l"));

        //İstenilen indexten başlayarak istenilen kadar(index 1den başlar gibi buna özgü) belirlenen diziye atar.
        // Dizinin kaçtan başlayacağını da veriyoruz.
        char[] karakterler=new char[5];
        message.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        //Verilen karakterin kaçıncı sırada olduğunu gösterir. karakter kelime aratılabilir.
        System.out.println(message.indexOf("n"));
        System.out.println(message.indexOf("av"));

        //Verilen karakterin kaçıncı sırada olduğunu gösterir. Saymaya normal başlar ancak sona göre değer alır.
        // Karakter kelime aratılabilir.
        System.out.println(message.lastIndexOf("n"));

        //Mesaj içerisinde bir karakter değiştirilmek istendiği zaman kullanılır.
        String yeniMessage=message.replace(" ","-");
        System.out.println(yeniMessage);

        //Bir metnin içerisinden parça almak için sadece başlangıç değeri verilebilir ya da başı sonu verilebilir.
        System.out.println(message.substring(2));
        System.out.println(message.substring(0,2));

        // bir metin içerisinde verilen değere göre metni böler dönüş olarak biz dizi verir
        for (String kelime:message.split(" ")){
            System.out.println(kelime);
        }

        //Verilen metini tüm harflerini büyük yapmak için toUpperCase
        System.out.println(message.toUpperCase());

        //Verilen metnin tüm harflerini küçük yapmak için toLowerCase
        System.out.println(message.toLowerCase());

        //Bir metinin başında ve sonunda gereksiz boşlukları almak için
        System.out.println(message.trim());






    }
}