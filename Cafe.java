/* This is a stub for the Cafe class */
import java.util.ArrayList;
public class Cafe extends Building {

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
    }
    
    public static void main(String[] args) {
        new Cafe("Compass Cafe", "Neilson Library", 2);
    }
    
}
