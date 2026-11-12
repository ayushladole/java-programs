import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        Scanner scan = new Scanner(System.in);

        double result;
        int a,b;
        System.out.print("Enter a: ");
        a = scan.nextInt();
        System.out.print("Enter b: ");
        b = scan.nextInt();

        //result = Math.pow(2,15);
        //result = Math.abs(-10);

        //result = Math.sqrt(2);
        result = Math.max(a,b);
        System.out.println("Max is : " + result);

        result = Math.min(a,b);
        System.out.println("Min is: " + result);

        scan.close();
    }
}
