import java.util.Scanner;
public class ternary_operator {
    public static void main(String[] args) {
        int a = 100;
        String result = (a>70)? "Pass" : "Fail";

        Scanner scan = new Scanner(System.in);
        System.out.println(result);

        System.out.print("Enter a number: "); 
        int number = scan.nextInt();

        

        String evenOrOdd = (number % 2 ==0) ? "Even" : "Odd";

        System.out.println("The number is " + evenOrOdd);
        }
}
