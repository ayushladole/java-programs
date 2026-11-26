//import java.util.Arrays;
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //int[] x = {1,2,4,15,63};
        //for(int i=0;i<=4;i++){
        //System.out.println(x[i]);
        //}

        // int[] arr = new int[5];
        // arr[0]= 18;
        // arr[1]= 15;
        // arr[2]= 89;
        // arr[3]= 75;
        // arr[4]= 20;

        // for(int i=0;i<arr.length;i++){
        // System.out.println(arr[i]);
        // }

        // int[] input = new int[5];

        // int n = input.length;

        // System.out.println("---Input 10 array integers and printing program---");
        
        // for(int i=0;i<5;i++){
        // System.out.print("Enter integer: ");
        // input[i]=scan.nextInt();
        
        // }

        // System.out.println("The array is: ");

        // for(int j=0;j<input.length;j++){
        // System.out.print((2*input[j]) + " ");
        // }


        //Given an array print negative numbers only: 

        int[] ayush = {1,2,-1,6,-35,62,-95};

        for(int i = 0;i<ayush.length;i++){
            if(ayush[i]<0){
            System.out.println(ayush[i]);
            }
            
        }

    

        scan.close();
    }
}
