public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double[] myList={1.1,2.3,4.5,6.7};
        double max=myList[0];
        double total=0;

        for (double number:myList){
            System.out.println(number);
            total+=number;
            max=max<number?number:max;
        }
        System.out.println("En büyük "+max);
        System.out.println("Toplam "+total);
    }
}