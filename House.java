/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {

  private ArrayList<String> residents;

  public int nResidents;
  public boolean hasDiningRoom;

  public House(String name, String address, int nFloors) {
    super(name, address, nFloors);
    System.out.println("You have built a house: 🏠");

  }

  public void moveIn(String name){
    residents.add(name);

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
    new House("Lamont House", "Prospect Street", 4);
  }

}