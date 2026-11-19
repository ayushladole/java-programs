import java.util.Scanner;
public class sumOfNaturalNos {
    public static void main(String[] args) {
        int i = 0;
        int j;
        int result=0;

        Scanner scan = new Scanner(System.in);


        System.out.print("Enter number of terms: ");
        i = scan.nextInt();
        for(j=0;j<=i;j++){
        result += j;


        }
        System.out.println("The addition of first " + i + " natural numbers is: " + result);
        scan.close();
    }
}
