
import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        //Q.- Multiply odd indexed element by 2 and even indexed element by 10

        Scanner scan = new Scanner(System.in);
        

        System.out.println("---Add 10 to even index and multiply 2 to odd index---");
        System.out.print("Enter number of elements in array: ");
        int n = scan.nextInt();

        int[] arr= new int[n];

        for(int j = 0;j<n;j++){
        System.out.print("Enter element in the array: ");
        arr[j]= scan.nextInt();
        }        

        

        System.out.println("Multiplying odd element by 2 and adding 10 to even elements: ");

        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]+=10;
                System.out.print(arr[i] + " ");
            }
            else{
            arr[i]*=2;
            System.out.print(arr[i] + " ");
            }
        }



        scan.close();
    }
}
