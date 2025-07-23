public class Main{

    public static void main(String[] args){

         
        try{
        System.out.println("test");

        // ClassA obj = new ClassA("vOne");

        // obj.show();
        System.out.println(Car.defaultColor);

        Car car1 = new Car();
        System.out.println(car1.color);
        car1.details();

        Car car2 = new Car("SilverBlue");
        System.out.println(car2.color);
        car2.details();

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("in the end it doesn't even matter...");
        }
        

    }
}