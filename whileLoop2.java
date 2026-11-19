import java.util.Scanner;

public class whileLoop2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age = scan.nextInt();

        while(age<0){
            System.out.println("Age cant be negative!");
            System.out.print("Enter your age: ");
            age = scan.nextInt();
        }

        System.out.println("Your age is : " + age);
        

        scan.close();
        
    }
}
