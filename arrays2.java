import java.util.Scanner;
//import java.util.Arrays;
public class arrays2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;

        System.out.println("---Array sum program---");
        System.out.print("Enter number of elements in array: ");
        int n = scan.nextInt();


        System.out.print("Enter elements in the array: ");

        int[] arr= new int[n];
        for(int i = 0;i<n;i++){
        arr[i]= scan.nextInt();
        }

        for(int j=0;j<n;j++){
        result = result + arr[j];
        }

        System.out.print("The addition of elements of the array is: " + result);
        
        scan.close();
    }
    
}
