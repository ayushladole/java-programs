import java.util.Scanner;

public class math2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of a: ");
        double a = scan.nextDouble();

        System.out.print("Enter length of b: ");
        double b = scan.nextDouble();

        double A,B;
        A = Math.pow(a, 2);
        B = Math.pow(b, 2);
        double result = A+B;
        double c = Math.sqrt(result);

        System.out.println("Hypotenuese is: " + c);

        scan.close();

    }
    
}
