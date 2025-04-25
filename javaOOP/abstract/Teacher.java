public class Teacher extends Human{


private String name;
private int age;


    public Teacher(String name, int age){
        this.name=name;
        this.age=age;

    }



    public void does(){
        System.out.printf("At %d , %s Guides and teaches. %n",age,name);
    }





}