public class ShapeMain{

    public static void main(String[] args){

        
        Circle circle = new Circle("c55",10);
        Triangle triangle = new Triangle("t16",20,6);
        Rectangle rectangle = new Rectangle("r15",40,2.5);

        Shape x = new Circle("x1",1);

        System.out.println(circle.info());
        System.out.println(circle.area());
        System.out.println(triangle.info());
        System.out.println(triangle.area());
        System.out.println(rectangle.info());
        System.out.println(rectangle.area());
        System.out.println(x.info());
    } 




}