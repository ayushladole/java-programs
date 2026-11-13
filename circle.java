import java.util.Scanner;

public class circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = scan.nextDouble();
        
        double area;
        double circumference;
        double volume;


        area = Math.PI*Math.pow(radius, 2);
        System.out.println("Area of circle is: " + area);
        
        circumference = 2*Math.PI*radius;
        System.out.println("Circumference is: " + circumference);

        volume = 4.0/3.0*Math.PI*Math.pow(radius,3);
        System.out.println("Volume is: " + volume);

        scan.close();
    
    }
}
