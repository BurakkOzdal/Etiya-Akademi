public class Main {
    public static void main(String[] args) {
        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel :Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok iyi: Geçtiniz");
                break;
            case 'C':
                System.out.println(" iyi: Geçtiniz");
                break;
            case 'D':
                System.out.println(" Geçtiniz");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Tanımsız not bilgisi");
        }


        // Bir sonuç iki case ile aynı sonucu vermesini istersen:
        //case degisken:
        //case degisken: işlemler burda olacak
    }
}