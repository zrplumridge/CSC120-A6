/* This is a stub for the Cafe class */
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
        //check for coffee and restock if necessary, then serve
        if (this.nCoffeeOunces < size){
            restock(100, 0, 0, 0);
        }
        this.nCoffeeOunces = this.nCoffeeOunces - size;

        //check sugar
        if (this.nSugarPackets < nSugarPackets){
            restock(0, 10, 0, 0);
        }
        this.nSugarPackets = this.nSugarPackets - nSugarPackets;

        //check creams
        if (this.nCreams < nCreams){
            restock(0, 0, 30, 0);
        }
        this.nCreams = this.nCreams - nCreams;

        //check cups
        if (nCups < 1){
            restock(0, 0, 0, 5);
        }
        this.nCups = this.nCups - 1;

       

        //be clear about which variables refer to what!
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = this.nCoffeeOunces + nCoffeeOunces;
        this.nSugarPackets = this.nSugarPackets + nSugarPackets;
        this.nCreams = this.nCreams + nCreams;
        this.nCups = this.nCups + nCups;
    }
    
    public static void main(String[] args) {
        new Cafe("Compass Cafe", "Neilson Library", 2, 20, 10, 20, 50);
    }
    
}
