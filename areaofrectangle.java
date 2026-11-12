import java.util.Scanner;
public class areaofrectangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter length of rectangle: ");
        int length = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = scan.nextInt();

        int area = length*breadth;

        System.out.println("Area is: " + area + " cm sq.");

        scan.close();

        //Hello

    }
}