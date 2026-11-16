import java.util.Scanner;
public class day{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);



        System.out.print("Enter a day: ");
        String day = scan.next();

        day = day.substring(0,1).toUpperCase() + day.substring(1);

        

        switch(day){
            
            case "Monday" ,"Tuesday" , "Wednesday" ,"Thursday" ,"Friday"
             -> System.out.println("It is a weekday!");
            case "Saturday" , "Sunday" -> System.out.println("It is a weekend!");

            default -> System.out.println(day + " is not a day");
        }

        scan.close();
    }
}