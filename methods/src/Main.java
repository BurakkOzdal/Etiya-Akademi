public class Main {
    public static void main(String[] args) {
       sayiBulmaca();
    }
    public static void sayiBulmaca() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int aranacak = 5;
        boolean varMi = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == aranacak) {
                varMi = true;
                break;
            }
        }

        String message = "Sayi ";
        if (varMi) {

            mesajVer(message + "bulundu: " + aranacak);
        } else {
            System.out.println(message + "bulunamadi: " + aranacak);
        }
    }

    public static void mesajVer(String message) {
        System.out.println(message);
    }
}