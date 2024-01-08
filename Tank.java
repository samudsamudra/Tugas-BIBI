/**
 * Tank
 */
public class Tank {

    String namatank;
    int kecepatan;
    int healthPoint;

    void run(){
        System.out.println(namatank + "  Sedang bergerak.... ");
        System.out.println("kecepatan: " + kecepatan);

   }

   boolean isDestroyed(){
    if(healthPoint <= 0) return true;
    return false; 
   }
}