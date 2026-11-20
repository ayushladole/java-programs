import java.util.Scanner;
public class method {
    public static void main(String[] args) {
        //String name = "ayush";
        //int age = 19;
        //happyBirthday(name,age);
        double num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = scan.nextDouble();
        
        System.out.println("The square is: " + square(num));
        scan.close();
    }

    

    static void happyBirthday(String name, int age){
        System.out.println("Happy birthday " + name);
        System.out.println("Happy birthday to you");
        System.out.println("You are " + age + " years old!");
    }

    static double square(double num){

        double result = num*num;
        return result;

    }
}
