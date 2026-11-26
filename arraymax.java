import java.util.Scanner;

public class arraymax {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        

        System.out.println("---Array maximum element program---");
        System.out.print("Enter number of elements in array: ");
        int n = scan.nextInt();

        
        System.out.print("Enter number elements in the array: ");
        int[] arr= new int[n];
        
        
        int max = arr[0];
       
        for(int i = 0;i<n;i++){
        arr[i]= scan.nextInt();
        }

        for(int j=0;j<n;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("Maximum is: " + max);

        scan.close();
    }
}
