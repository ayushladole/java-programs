import java.util.Scanner;
public class scanner1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
        

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(age>=18){
            System.out.println("You are eligible to drive because you are " + age + " years old " + name + "!");

        }
        else {
            System.out.println("Go play games kid xd");
        }
        
        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();

        if(isStudent){
           System.out.println("Congrats for being a student!");
        }
        else{
            System.out.println("Go get a life ");
        }

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.println("Your gpa is " + gpa);
        scanner.close();
    }
}
