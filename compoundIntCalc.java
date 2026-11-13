import java.util.Scanner;

public class compoundIntCalc{
    public static void main(String[] args) {
        
        double a;
        double principle;
        double r,n,t;

        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the principle amount: ");
        principle = scan.nextDouble();

        System.out.print("Enter annual nominal rate of interest: ");
        r = scan.nextDouble();
        double r2 = r/100;

        System.out.print("Enter number of times interest is compounded that year: ");
        n = scan.nextDouble();

        System.out.print("Total time the money is borrowed (in yrs): ");
        t = scan.nextDouble();

        a = principle*Math.pow((1+(r2/n)), n*t);

        System.out.printf("The amount is: %.2f", a);

        scan.close();




    }
    
}