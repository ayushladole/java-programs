import java.util.Scanner;
public class ifstatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;


        System.out.print("Enter your name: ");
        name = scan.nextLine();

        System.out.print("Enter your age: ");
        age = scan.nextInt();

        System.out.println("Are you a student? (true/false)");
        isStudent = scan.nextBoolean();
        //Group - 1

        if(name.isEmpty()){
            System.out.println("You didnt write any name!");
        }
        else{
            System.out.println("Hello " + name);
        }

        //Group - 2
        if(age>=70){
            System.out.println("You are a senior");
        }
        else if(age>=18){
            System.out.println("You are an adult!");
        }
        else if(age ==0){
            System.out.println("You are a baby!");
        }
        
        else{
            System.out.println("You are not an adult");
        }
        // Group - 3

        if(isStudent){
            System.out.println("You are a student " + name);
        }
        else{
            System.out.println("You are not a student " + name);
        }
        scan.close();
    }

}