public class Circle extends Shape{

    private double radius;

    public Circle(String name,double radius){//declare all variables that will be used
            super(name);//calls the super classess construrtor with provided parameter.
            this.radius=radius;
    }


    public double area(){
        return Math.PI *radius*radius;
    }

}