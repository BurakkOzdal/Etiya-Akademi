public class Main {
    public static void main(String[] args) {

        //For
        for (int i=1;i<10;i++){
            System.out.println(i);
        }
        System.out.println("Döngü bitti");


        for (int i=2; i<10;i+=2){
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");


        //While
        int i=1;
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While döngüsü bitti");

        // Do-While
        int j=1;
        do{
            System.out.println(i);
            j++;
        }while (j<10);
    }
}