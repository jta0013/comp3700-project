import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import main.controllers.ItemController;
class EmployeeClient {
    public static void printAsterisks(){
        System.out.println("*******************************************************");
    }
    public static void main(String[] args) {
        ItemController itemCtrl = new ItemController();

        boolean finished = false;
        while(!finished) {
            System.out.println("Welcome to the user library management system\n\n");
            printAsterisks();
            System.out.println("Please select the resource that you would like to create/modify");
            System.out.println("1 - Library Item");
            System.out.println("2 - Membership");
            System.out.println("3 - Reservation");
            printAsterisks();
            System.out.println("\n");
            Scanner s = new Scanner(System.in);
            switch (s.nextInt()) {
                case 1:
                    System.out.println("\n1 - Add Item");
                    System.out.println("2 - Remove Item");
                    System.out.println("3 - Update Item");
                    switch(s.nextInt()) {
                        case 1: 
                          System.out.println("\nPlease enter item type (i.e. video, magazine, or newspaper: ");
                          String type = s.next();
                          System.out.println("\nPlease enter title");
                          String title = s.next();
                          System.out.println("\nPlease enter producer");
                          String producer = s.next();                          
                          System.out.println("\nPlease enter release date FORMAT mm/dd/yyyy");
                          String dateString = s.next();
                          DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
                          Date releaseDate = new Date();
                          try {
                                releaseDate = df.parse(dateString);
                            }
                            catch (Exception e) {
                                System.out.println("INVALID DATE, EXITING...");
                                finished = true;
                                continue;
                            }
                          itemCtrl.addItem(type, title, producer, releaseDate);
                          break;
                        case 2:
                          System.out.println("\nPlease enter item ID:");
                          String identifier = s.next();
                          itemCtrl.deleteItem(identifier);
                          break;
                        default:
                          continue;
                    }
                case 2: 
                case 3:
                default:
                  continue;

            }


        }
    }
}