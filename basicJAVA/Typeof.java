public class Typeof {
    //here i want to show that a default construtor sets the value for un assigned variables.
    String name;
    int number;
    boolean isAvailable;

    public static void main(String[] args) {
        Typeof obj = new Typeof(); 
        System.out.printf(" %s \n %d \n %b \n", obj.name, obj.number, obj.isAvailable);
        System.out.println(obj);
    }
}
