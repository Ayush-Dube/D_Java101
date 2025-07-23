public class ClassA{

    static String name = "vZero";
    String name;

    ClassA(String x){
        this.name=x;
    }

    void show(){
        System.out.println(ClassA.name);
        System.out.println(this.name);
    }
}