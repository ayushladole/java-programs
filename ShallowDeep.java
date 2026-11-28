import java.util.Arrays;

public class ShallowDeep {
    public static void main(String[] args) {
        int[] a = {10,20,30,49};

        // int[] x = a; // x is shallow copy of a

        // x[0] = 100;

        int[] deep = Arrays.copyOf(a,a.length);

        deep[0] = 43;
        

        System.out.println(a[0]);

        


    }
}
