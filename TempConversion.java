import java.util.Scanner;
public class TempConversion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("----Temperature conversion program----");
        System.out.println("1. Convert farenheit to celsius");
        System.out.println("2. Convert celsius to farenheit");
        System.out.print("Enter one of two choices (1 or 2): ");
        int choice = scan.nextInt();
        System.out.print("Enter temperature: ");
        double temperature = scan.nextDouble();

        double CtF = temperature*(9/5) + 32;
        double FtC = (temperature-32)*5/9;

        double result = (choice ==2 ) ? CtF : FtC;

        System.out.printf("The result is: %.2f ", result);
        scan.close();
        
    }
}
