import java.util.Scanner;

public class nestedLoops {
    public static void main(String[] args) {
        int rows;
        int columns;
        int i,j;
        char symbol;
        Scanner scan = new Scanner(System.in);
         
        System.out.print("Enter number of rows: ");
        rows = scan.nextInt();

        System.out.print("Enter number of columns: ");
        columns = scan.nextInt();
        System.out.print("Enter symbol to be printed: ");
        symbol = scan.next().charAt(0);

        for(j=1;j<=rows;j++){
            for(i=1;i<=columns;i++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scan.close();
    }
}
