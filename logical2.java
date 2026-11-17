public class logical2 {
    public static void main(String[] args) {
        boolean a = true || false || false;
        System.out.println(a);
        boolean b = true && true;
        System.out.println(b);

        boolean c = !(false && true && true);
        System.out.println(c);

        int num1 = 5;
        int num2 = 6;

        boolean result = !(num1==num2);
        System.out.println("\n\n\n" + result);


    }
}
