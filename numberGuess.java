import java.util.Scanner;
import java.util.Random;
public class numberGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0;

        Random r = new Random();

        int j = r.nextInt(1,11);

        while(!(i==j)){
        System.out.println("---Number guessing game---");
        System.out.print("Enter a number between 1-10: ");
        i = scan.nextInt();
        if(i>j){
            System.out.println("Higher than the correct number try again!");
        }
        else if(j>i){
            System.out.println("Lower than the correct number try again!");
        }
        }

        System.out.println("You found the correct number! The correct number is: " + j);

        scan.close();


    }
}
