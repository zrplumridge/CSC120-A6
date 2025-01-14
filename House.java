/* 
 * House class
 * Assignment 6
 * 
 * House is child of building
 * includes move in and move out functions
 * @author Zoe Plumridge
 */
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
    System.out.println(residents.size() + " current residents");
    nResidents = residents.size();
    return nResidents;
  }

  public void moveIn(String name){
    residents.add(name);
    this.nResidents();
  }

  public String moveOut(String name){
    residents.remove(name);
    this.nResidents();

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