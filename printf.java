public class printf {
    public static void main(String[] args) {
        
        String name = "ayush";
        char letter = 'a';
        double height = 60.54111111111;
        boolean isStudent = true;
        int age = 19;


        System.out.printf("Name is : %s \n", name);
        System.out.printf("Your name starts with : %c \n" , letter);
        System.out.printf("Age is: %d\n", age);
        System.out.printf("Height is: %.2f\n", height);
        System.out.printf("Student: %b\n", isStudent);

        System.out.printf("Hello %s, your height is %.2f, your age is %d and your name starts with %c .", name, height, age, letter);

    }
}
