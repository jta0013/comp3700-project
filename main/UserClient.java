import java.util.Scanner;
import ItemController
class UserClient {
    public static void printAsterisks(){
        System.out.println("*******************************************************");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the user library management system\n\n");
        printAsterisks();
        System.out.println("Please select the resource that you would like to create/modify");
        System.out.println("1 - Library Item");
        System.out.println("2 - Membership");
        System.out.println("3 - Reservation");
        printAsterisks();
        System.out.println("\n");

        boolean finished = false;
        while(!finished) {
            Scanner s = new Scanner(System.in);
            switch (s.nextInt()) {
                case 1:
                    ItemController ctrl = new ItemController();
                    System.out.println("1 - Add Item");
                    System.out.println("2 - Remove Item");
                    System.out.println("3 - Update Item");
                    switch(s.nextInt()) {
                        case 1: 
                          System.out.println("Please enter title");
                          String title = s.next();
                          ctrl.addItem(title);


                    }
                case 2: 
                case 3:

            }
        }
    }
}