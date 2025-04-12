import java.util.Scanner;

public class UsrInput{




    public static void main(String[] args){
        // System.out.print("Te");

        Scanner scn = new Scanner(System.in); 

        System.out.println("Enter your name: ");
        String name = scn.nextLine();
        System.out.println("Helllo '"+name.toUpperCase()+"', Welcome to world of Java.");
        
        // System.out.println("Enter a Number: ");
        // int num = scn.nextInt();
        // System.out.println("You entered: "+num);


        System.out.println("lets find area of a rectangle;");
        System.out.print("Enter Lenght in cms: ");
        double length = scn.nextDouble();

        System.out.print("Enter Breadth in cms: ");
        double breadth = scn.nextDouble();

        System.out.println("the area of the rectangle is: "+length*breadth+" cm²");








        scn.close();//why use this






    }
}