/**
 * game
 */
public class game {

    public static void main(String[] args) {
        
        Tank PanzerKampfwagen = new Tank();

        PanzerKampfwagen.namatank = "SturmTiger";
        PanzerKampfwagen.kecepatan = 34;
        PanzerKampfwagen.healthPoint = 0;

        PanzerKampfwagen.run();

        if(PanzerKampfwagen.isDestroyed()){
            System.out.println("Game Over!");
        }
    }
}