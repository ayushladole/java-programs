import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("------Calculator------");
        System.out.println("Following options are available: ");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Subtraction");
        System.out.println("4. Division");

        System.out.print("Enter choice (1/2/3/4): ");
        int choice = scan.nextInt();

        if(choice!=1 && choice!=2 && choice!=3 && choice!=4){
            System.out.println("INVALID CHOICE!");
            System.exit(0);
        }
        System.out.print("Enter first number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();

        switch(choice){
            case 1: {
            double result1 = num1+num2;
            System.out.println("Addition is : " + result1);
            break;
            }
            case 2: {
                
            double result2 = num1*num2;
            System.out.println("Multiplication is: " + result2);
            break;
            }

            case 3: {
            double result3 = num1-num2;
            System.out.println("Subtraction is: " + result3);
            break;
            }

            case 4: {
            double result4 = num1/num2;
            System.out.println("Division is: " + result4);
            break;
            }


            
        }

        scan.close();
    }
}
