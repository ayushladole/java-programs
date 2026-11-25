import java.util.Scanner;
import java.util.Random;

public class diceRoll{
    public static void main(String[] args) {
        
        //Dice roller program
        
        
        // Get number of dice from user
        //Check if dice less than zero

        //Roll all dice
        //Get sum
        // Display ascii art of dice

        Scanner scan = new Scanner(System.in);
        Random random = new Random();



        System.out.print("Enter number of dice to be rolled: ");
        int dicenum = scan.nextInt();

        
        
        int DiceTotal=0;


        if(dicenum<0){
            System.out.println("Number of dice cant be less than zero!");
        }
        else{

            int i;
            for(i=0;i<dicenum;i++){
                int roll = random.nextInt(1,7);
                printdie(roll);
                System.out.println("You rolled : " + roll);
                
                DiceTotal = DiceTotal + roll;
                
            }
        System.out.println("Total is: " + DiceTotal);

        }

        scan.close();
    }

    static void printdie(int roll){

        String dice1 = """
                     -------
                    |       |
                    |   ●   | 
                    |       | 
                     -------
                    """;
        
        String dice2 = """
                     -------
                    | ●     |
                    |       | 
                    |     ● | 
                     -------
                    """;

        String dice3 = """
                     -------
                    | ●     |
                    |   ●   | 
                    |     ● | 
                     -------
                    """;

        String dice4 = """
                     -------
                    | ●   ● |
                    |       | 
                    | ●   ● | 
                     -------
                    """;

        String dice5 = """
                     -------
                    | ●   ● |
                    |   ●   | 
                    | ●   ● | 
                     -------
                    """;

        String dice6 = """
                     -------
                    | ●   ● |
                    | ●   ● | 
                    | ●   ● | 
                     -------
                    """;

        switch(roll){
            case 1: {
                System.out.print(dice1);
                break;
            }
            case 2: {
                System.out.print(dice2);
                break;
            }

            case 3: {
                System.out.print(dice3);
                break;
            }

            case 4: {
                System.out.print(dice4);
                break;
            }

            case 5: {
                System.out.print(dice5);
                break;
            }

            case 6: {
                System.out.print(dice6);
                break;
            }

        }
    
    }
}