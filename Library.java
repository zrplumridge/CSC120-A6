/* 
 * Library class
 * Assignment 6
 * 
 * Library is child of building
 * includes methods to add and remove books from inventory and to check out or return books
 * @author Zoe Plumridge
 */
import java.util.Hashtable;


public class Library extends Building{

  private Hashtable<String, Boolean> collection = new Hashtable <String, Boolean>();

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    System.out.println("You have built a library: 📖");
  }

  public void addTitle(String title){
    collection.put(title, true);
    System.out.println("You have added " + title);
  }

  public String removeTitle(String title){
    if (collection.get(title)) {
      collection.remove(title);
      System.out.println("You have removed " + title);
    } else {
      System.out.println("This book could not be removed."); //or throw exception ??
    }
    return(title);
  } // return the title that we removed

  public void checkOut(String title){
    if (collection.get(title)) {
      collection.remove(title);
      collection.put(title, false);
      System.out.println("You have checked out " + title);
    } else if (collection.get(title) == false) {
      System.out.println("This book is not available right now. ");
    } else {
      System.out.println("This library does not own this book."); //or throw exception ??
    }
  }
  public void returnBook(String title){
    if (collection.get(title)==false) {
      collection.remove(title);
      collection.put(title, true);
      System.out.println("You have returned " + title);
    } else {
      System.out.println("You returned this book to the wrong library."); //or throw exception ??
    }
  }

  public boolean containsTitle(String title){
    return collection.contains(title); //one of these is wrong but must test
  }
   // returns true if the title appears as a key in the Libary's collection, false otherwise
  
  public boolean isAvailable(String title){
    return collection.get(title);
  }
  // returns true if the title is currently available, false otherwise
  
  public void printCollection(){
    System.out.println(collection.toString());
  }
  // prints out the entire collection in an easy-to-read way (including checkout status)

  public static void main(String[] args) {
    Library Josten = new Library("Josten", "Green Street", 1);
    Josten.addTitle("My Music");
    Josten.addTitle("Brother Robert");
    Josten.checkOut("My Music");
    Josten.returnBook("My Music");
  }
  
}