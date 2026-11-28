import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] array = {2,5,-2,63,764,54,-63,-7};

        print(array);
        Arrays.sort(array);
        print(array);
    
    }

    public static void print(int[] array) {
        for(int i = 0;i<8;i++){
            System.out.print(array[i] + " ");
        }

    System.out.println();
    }
}
