import java.util.Random;
import java.util.Scanner;


public class special_restaurant {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    
    System.out.println("=====CAMPUS CANTEEN MENU=====\n1. Burger: $10.59\n2. Pizza: $12.99\n3. Coca cola: $5.99\n4. Chocolate: $3.79\n5. Sandwich: $6.99");
    
    int tokenNum = random.nextInt(1,101);

    System.out.print("Please enter your name: ");
    String name = scan.next();

    name = name.toUpperCase();


    System.out.print("Please enter number of pizzas you would like to have: ");
    int pizzanum = scan.nextInt();
    if(pizzanum<0){
        System.out.println("Number of pizzas cant be negative! Exiting...");
        System.exit(0);

    }

    double pizzaPrice = pizzanum*12.99;


    System.out.print("Please enter number of burgers you would like to have: ");
    int burgernum = scan.nextInt();

    if(burgernum<0){
        System.out.println("Number of burger cant be negative! Exiting...");
        System.exit(0);

    }

    double burgerPrice = burgernum*10.59;


    System.out.print("Please enter number of coca colas you would like to have: ");
    int colanum = scan.nextInt();

    if(colanum<0){
        System.out.println("Number of coca colas cant be negative! Exiting...");
        System.exit(0);

    }

    double colaPrice = colanum*5.99;


    System.out.print("Please enter number of chocolates you would like to have: ");
    int chocolatenum = scan.nextInt();

    if(chocolatenum<0){
        System.out.println("Number of chocolates cant be negative! Exiting...");
        System.exit(0);

    }

    double chocolatePrice = chocolatenum*3.79;


    System.out.print("Please enter number of sandwiches you would like to have: ");
    int sandwichnum = scan.nextInt();

    if(sandwichnum<0){
        System.out.println("Number of sandwiches cant be negative! Exiting...");
        System.exit(0);

    }

    double sandwichPrice = sandwichnum*6.99;

    System.out.print("Are you a premium member? (yes/no): ");
    String member = scan.next();

    System.out.println("--------RECEIPT--------");

    System.out.println("Customer name: " + name);
    System.out.println("Token number: " + tokenNum);
    System.out.println("--------------------------\n");

    System.out.printf("Pizza: $%.2f\n", pizzaPrice);
    System.out.printf("Sandwich: $%.2f\n", sandwichPrice);
    System.out.printf("Burger: $%.2f\n", burgerPrice);
    System.out.printf("Coca cola: $%.2f\n", colaPrice);
    System.out.printf("Chocolate: $%.2f\n", chocolatePrice);

    double total = pizzaPrice+sandwichPrice+burgerPrice+colaPrice+chocolatePrice;

    System.out.println("\n--------------------------");

    System.out.printf("Subtotal: $%.2f\n ", total);


    if(member.equalsIgnoreCase("yes")){

        System.out.println("Member status: ⭐ Premium member!");

        System.out.println("Discount: 10%");
        System.out.printf("After discount: %.2f\n", total*0.90);
        double afterdiscount = total*0.90;
        double tax = afterdiscount*0.05;
        double finalamt= tax + afterdiscount;


        System.out.printf("GST (5%%) : %.2f\n", tax);
        System.out.printf("Final amount = %.2f\n", finalamt);

        System.out.println("Rounded payable: " + Math.round(finalamt));
        System.out.println("Free dessert!");
        System.out.println("---------------------");
    }

    else{
        System.out.println("Member status: Not a premium member :( ");
        System.out.println("Discount: 0%");

        double tax = total*0.05;
        double finalamt = total+total*0.05;
        
        System.out.printf("GST (5%%) : %.2f\n", tax);
        System.out.printf("Final amount = %.2f\n", finalamt);

        System.out.println("Rounded payable: " + Math.round(finalamt));
        
        System.out.println("---------------------");

    }
    scan.close();
    }
}
