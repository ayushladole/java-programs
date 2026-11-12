import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random random = new Random();
        Random r = new Random();


        int number;

        number = random.nextInt(0,11);

        System.out.println(number);

        boolean isHeads;

        isHeads = r.nextBoolean();

        if(isHeads){
            System.out.println("Heads");

        }
        else{
            System.out.println("Tails");
        }
    }
}
