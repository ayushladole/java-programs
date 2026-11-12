import java.util.Scanner;


public class magical_mad_libs_game{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magical Mad Libs Shop!");
        System.out.print("What is your name, adventurer? : ");

        String name = scan.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.print("Enter your current balance: ");

        double balance = scan.nextDouble();
        scan.nextLine();

        System.out.println("\n\n");

        System.out.println("---- CREATE YOUR ITEM ----");
        System.out.print("Enter an adjective (e.g., shiny, slimy): ");
        String adjective = scan.nextLine();

        System.out.println("Enter a noun (e.g., potato, sword): ");
        String noun = scan.nextLine();

        System.out.println("\n\n");

        System.out.println("The shopkeeper pulls out a " + adjective + " " + noun + " from his drawer!");
        System.out.println("The shopkeeper says: 'This " + adjective + " " + noun +  " costs 9 gold each.'");

        System.out.println("How many " + adjective + " " + noun + " would you like to buy? ");
        System.out.print("Enter quantity: ");
        int quantity = scan.nextInt();

        double cost = quantity*9;

        System.out.println("--- CHECKOUT ---");
        System.out.println("Item price: 9 gold ");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost: " + cost);

        System.out.println("Your balance: " + balance);

        System.out.println("\n\n");
        
        System.out.println("--------------------\n\n");
        
        if(balance>=cost){
            System.out.println("Purchase successful!! ");
            System.out.println("You bought " + quantity + " " + adjective + " " + noun + "!");
            double NewBal = balance - cost;
            System.out.println("Your new balance is: " + NewBal );

        }

        else{
            System.out.println("Oh no! You dont have enough money!");

            double deficit = cost - balance;

            System.out.println("You need " + deficit + " more gold to buy this!");
            System.out.println("The shopkeeper kicks u out");
        }

        scan.close();
    }

    
    //Hi
}
