public class GamerManager {
    private GameCalculator gameCalculator;

    public GamerManager(GameCalculator gameCalculator){
        this.gameCalculator=gameCalculator;
    }

    public void Play(){
        this.gameCalculator.hesapla();
    }

    public void FinishGame(){
        this.gameCalculator.gameOver();
    }
}
