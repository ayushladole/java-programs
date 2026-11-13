import java.util.Scanner;
public class nestedif {
    public static void main(String[] args) {
        
        boolean isStudent;
        boolean isspecialStudent;
        double price = 100;

        Scanner scan = new Scanner(System.in);


        System.out.print("Are you a student? (true/false) : ");
        isStudent = scan.nextBoolean();

        System.out.print("Are you a Special student? (true/false): ");
        isspecialStudent = scan.nextBoolean();


        if(isStudent){
            
                if(isspecialStudent){
                    price *=0.8;
                    System.out.println("Your ticket price after 20% discount is: $" + price);
                }
                else{
                    price *=0.9;
                    System.out.println("Your ticket price after 10% discount is: $" + price);
                }
                
        }
        else{
        System.out.println("Your price is : $" + price);
        }
        
        scan.close();
    }
    
}
