public class Rectangle extends Shape{

    private double length;
    private double breadth;
    
    public Rectangle(String name,double length,double breadth){
        super(name);
        this.length=length;
        this.breadth=breadth;
    }

    public double area(){
        return length*breadth;
    }





}