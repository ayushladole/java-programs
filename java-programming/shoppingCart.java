import java.util.Scanner;
public class shoppingCart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float price;
        float total;

        System.out.print("Enter item you would like to buy: ");
        String item = scan.nextLine();

        System.out.print("Enter price of one item: ");

        price = scan.nextFloat();

        System.out.print("Enter qty: ");
        int quantity = scan.nextInt();

        total = quantity*price;
        System.out.println("The total price is: " + total + " for " + quantity + " " + item + "/s");

        scan.close();
    }
}
