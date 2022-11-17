public class Main {
    public static void main(String[] args) {
        GamerManager manGamerManager=new GamerManager(new ManGameCalculator());
        manGamerManager.Play();
        manGamerManager.FinishGame();

        GamerManager kidGamerManager=new GamerManager(new KidsGameCalculator());
        kidGamerManager.Play();
    }
}