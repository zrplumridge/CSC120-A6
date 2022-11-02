/* This is a stub for the Cafe class */
import java.util.ArrayList;
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory 

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        nCoffeeOunces = nCoffeeOunces - size;
        nSugarPackets = nSugarPackets - this.nSugarPackets;
        nCreams = nCreams - this.nCreams;
        //be clear about which variables refer to what!
    }
    
    public static void main(String[] args) {
        new Cafe("Compass Cafe", "Neilson Library", 2, 20, 10, 20, 50);
    }
    
}
