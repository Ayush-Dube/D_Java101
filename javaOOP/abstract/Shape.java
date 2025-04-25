public abstract class Shape{

    String name;

    public Shape(String name){
        this.name = name;
    }


    public abstract double area();




    public String info(){
        return "ShapeName: "+name;
    }
}