import java.util.Scanner;

public class strings {

    public static void main(String[] args) {
    
    
        Scanner scan = new Scanner(System.in);

    System.out.print("Enter a password: ");

    String pwd = scan.next();

    int length = pwd.length();

    if(length>5){
        System.out.println("New password saved!");

    }
    else{
        System.out.println("Password cannot be less than 5 characters! Please set pwd again!");
    }

    scan.close();

    String something = "Ayush";

    char letter = something.charAt(4);
    // int a = something.indexOf("g");
    
    
    // something = something.toUpperCase();
    // System.out.println("Hello! " + something);
    // System.out.println(a);


    // System.out.println(letter);

    something = something.replace("A", "g" );
    System.out.println(something);

    
}
}
