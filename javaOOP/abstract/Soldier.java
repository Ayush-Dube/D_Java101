public class Soldier extends Human{



    private String name;
    private int age;


    public Soldier(String name, int age){
        this.name=name;
        this.age=age;

    }



   






    public void does(){
        System.out.printf("At %d ,%s  Fights and Protects.%n",age,name);
    }
}