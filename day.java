import java.util.Scanner;
public class day{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);



        System.out.print("Enter a day: ");
        String day = scan.next();

        day = day.substring(0,1).toUpperCase() + day.substring(1);

        

        switch(day){
            case "" -> System.out.println("Day cant be empty!"); 
            case "Monday" -> System.out.println("It is a weekday!");
            case "Tuesday" -> System.out.println("It is a weekday!");
            case "Wednesday" -> System.out.println("It is a weekday!");
            case "Thursday" -> System.out.println("It is a weekday!");
            case "Friday" -> System.out.println("It is a weekday!");
            case "Saturday" -> System.out.println("It is a weekday!");
            case "Sunday" -> System.out.println("It is a weekend!");
        }

        scan.close();
    }
}