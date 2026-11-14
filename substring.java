import java.util.Scanner;

public class substring{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Enter email: ");

        String email = scan.nextLine();


        if(email.contains("@")){
        String username = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);

        System.out.println("Hello " + username);
        System.out.println("The domain is: " + domain);
        }
        else{
            System.out.println("Email must be valid!");
        }

        scan.close();
    }
}