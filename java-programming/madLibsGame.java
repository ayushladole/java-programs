import java.util.Scanner;
public class madLibsGame {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String adjective1;
        String noun;
        String adjective2;
        String verb;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scan.nextLine();

        System.out.print("Enter a noun (name of animal): ");
        noun = scan.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective2 = scan.nextLine();

        System.out.println("Enter a verb (action): ");
        verb = scan.nextLine();

        System.out.println("I went to a " + adjective1 + " zoo and saw " + noun);
        System.out.println("The " + noun + " was " + adjective2 + " and was " + verb + " !");
        
        scan.close();
    }
}
