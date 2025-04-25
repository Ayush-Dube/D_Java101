public class AbstractMain{



    public static void main(String[] args){

        Player p1 = new Player("Adam",23);
        Soldier s1 = new Soldier("Teja",24);
        Teacher t1 = new Teacher("Veer",25);


        p1.does();
        s1.does();
        t1.does();

        p1.home();
        s1.home();
        t1.home();

    }



}