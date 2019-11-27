import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i = 0;
      String productName;
      int productPrice = 0;
      int productQuantity = 0;
      int cartTotal = 0;
  
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();

      // Get item 1 details from user, create itemToPurchase object
      System.out.println("Item 1");
      System.out.println("Enter the item name: ");
      productName = scnr.nextLine(); // Sets the variable productName for user input
      
      System.out.println("Enter the item price: ");
      productPrice = scnr.nextInt(); // Set the variable productPrice for user input
      
      System.out.println("Enter the item quantity: ");
      productQuantity = scnr.nextInt(); // Set the variable productQuantity for user user input
      System.out.println("");
      
      item1.setName(productName);
      item1.setPrice(productPrice);
      item1.setQuantity(productQuantity);
      
 
      // Get item 2 details from user, create itemToPurchase object
      System.out.println("Item 2");
      System.out.println("Enter the item name: ");
      scnr.nextLine();
      productName = scnr.nextLine(); // Sets the variable productName for user input
      
      System.out.println("Enter the item price: ");
      productPrice = scnr.nextInt(); // Set the variable productPrice for user input
      
      System.out.println("Enter the item quantity: ");
      productQuantity = scnr.nextInt(); // Set the variable productQuantity for user user input
      System.out.println("");
      
      item2.setName(productName);
      item2.setPrice(productPrice);
      item2.setQuantity(productQuantity);
      
      cartTotal = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());
      
      System.out.println("TOTAL COST");
      System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + (item1.getPrice() * item1.getQuantity()));

      System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + (item2.getPrice() * item2.getQuantity()));
      System.out.println("");
      
      System.out.println("Total: $" + cartTotal);
   
   
      return;
      }
   }
