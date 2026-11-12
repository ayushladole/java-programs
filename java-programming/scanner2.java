import java.util.Scanner;
public class scanner2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.next();

        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter your senior quote: ");
        String quote = scan.nextLine();
        

        System.out.println("Thank you " + name + " of age " + age + " years old");
        System.out.println("and your senior quote is " + quote );

        scan.close();
    }
}
