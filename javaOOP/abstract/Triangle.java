public class Triangle extends Shape{
    private double heigth;
    private double base;

    public Triangle(String name,double heigth,double base){
        super(name);
        this.heigth=heigth;
        this.base=base;
    }

    public double area(){
        return 0.5*heigth*base;
    }


}    