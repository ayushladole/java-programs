import java.util.Scanner;
public class whileLoops{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter name: ");
            name = scan.nextLine();

        }
        
        System.out.println("Hello " + name);
        
        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game!");
            System.out.println("Press Q to exit");

            response = scan.next().toUpperCase();

        }
        
        System.out.println("You have quit the game");

        scan.close();
    }
}