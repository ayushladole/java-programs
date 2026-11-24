public class overloadedMethods2{
    public static void main(String[] args) {
        

        System.out.println(car("Angry", "Black", "Fastback", "Ford"));
        System.out.println("Horsepower: " + carHP(500));
        System.out.println("Car Capacity : " + carCapacity(2) + " people");

    }

    static String car(String adjective, String colour, String variant, String company){
        return adjective + " " + variant + " " + colour + " " + company +  " Mustang";
    }
    static int carHP(int HP){
        return HP;
    }
    static int carCapacity(int capacity){
        return capacity;
    }
}