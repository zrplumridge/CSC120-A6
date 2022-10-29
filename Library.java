/* This is a stub for the Library class */
import java.util.ArrayList;
public class Library extends Building{

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      System.out.println("You have built a library: 📖");
    }
  
    public static void main(String[] args) {
      new Library("Josten", "Green Street", 1);
    }
  
  }