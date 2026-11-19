import java.util.Scanner;

public class printingTable {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int result;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of which table is to be printed: ");
        i = scan.nextInt();
        
        for(j=1;j<=10;j++){
            result=i*j;
            System.out.printf("%d x %d = %d\n", i,j,result);
        }



        scan.close();
    }
}
