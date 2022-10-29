/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {

  private ArrayList<String> residents;

  int nResidents;
  boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDR) {
    super(name, address, nFloors); //generally good idea to call parent constructor first then can change
    //name + " House"
    System.out.println("You have built a house: 🏠");
    this.hasDiningRoom = hasDR;
    this.residents = new ArrayList<String>();
  }

  public boolean hasDiningRoom() {
    return hasDiningRoom;
  }

  public int nResidents() {
    //System.out.println(residents.getLength());
    return nResidents;
  }

  public void moveIn(String name){
    residents.add(name);
    this.nResidents += 1;
  }

  public String moveOut(String name){
    residents.remove(name);

    //return name of person who moved out
    return name;
  } 

  public boolean isResident(String person) {
    return residents.contains(person);
  }

  public static void main(String[] args) {
    House Lamont = new House("Lamont House", "Prospect Street", 4, true);
    Lamont.moveIn("Izzy");
    Lamont.moveIn("Hannah");
    Lamont.moveIn("Zoe");
    Lamont.moveIn("Joanna");
    System.out.println(Lamont.moveOut("Hannah") + " moved out :(");
    System.out.println(Lamont.nResidents());
    System.out.println("Has dining hall: " + Lamont.hasDiningRoom());
  }

}