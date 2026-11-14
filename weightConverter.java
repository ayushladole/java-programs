import java.util.Scanner;
public class weightConverter {
    public static void main(String[] args) {
        

        double weight,result;
        Scanner scan = new Scanner(System.in);


        System.out.println("-----Weight conversion program-----");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");
        System.out.print("Enter choice: (1 or 2): ");

        int choice = scan.nextInt();

        if(choice == 1){
            System.out.print("Enter weight in lbs: ");
            weight = scan.nextDouble();
            result = weight/2.205;
            System.out.printf("Weight in kgs is: %.2f kgs", result);
        }
        else if(choice ==2){
            System.out.print("Enter weight in kgs: ");
            weight = scan.nextDouble();
            result = weight*2.205;
            System.out.printf("Weight in lbs is: %.2f lbs", result );
        }
        else{
            System.out.println("Invalid choice!");
        }
        scan.close();

    }
    
}
