import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
    int i;

    for(i=1;i<2;i++){
        System.out.println("Hello world");
    }

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter integer at which counting stops: ");
    int num = scan.nextInt();
    int j;

    for(j=0;j<=num;j++){
        System.out.println(j);
    }

    

    scan.close();
    }
    
}
