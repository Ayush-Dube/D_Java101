public class Player extends Human {
    
    private String name;
    private int age;


    public Player(String name, int age){
        this.name=name;
        this.age=age;

    }



    public void does(){
        System.out.printf("At %d , %s Plays a game.%n", age, name);
    }
    
    
    public static void main(String[] args){
        System.out.println("Players main method");
    }

}