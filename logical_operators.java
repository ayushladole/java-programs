import java.util.Scanner;
public class logical_operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter temp in degree celsius: ");
        double temp = scan.nextDouble();
        System.out.print("Is it raining heavily? (true/false) : ");
        boolean isHeavyRain = scan.nextBoolean();

        if(temp<=40 && temp >=25){
            System.out.println("Its a pleasant day!");
            if(isHeavyRain){
                System.out.println("I hope the rain is watering the plants!");
            }
        }
        else if(temp<25){
            System.out.println("Its a cold day!");
             if(isHeavyRain){
                System.out.println("I hope the rain is watering the plants!");
            }
        }
        
        else{
            System.out.println("Its a hot day!");
        
        }


        scan.close();
    }
}
