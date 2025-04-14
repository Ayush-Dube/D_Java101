public class JaavaMethods{

    //method => a block of reusable code.
    /*
        DRY --> Dont repeat Yourself

        1. can not write the methods inside the main method (static)
        2. Static can call static easily, if not static method ie a non static method -->then do instantsiation (new object)
           Static likes Static in java
        3. Methods are unaware of variables declared within other methods.There use arguements/parameters.
        4. return
           instead of using void ,use the datatype which u are expecting as return 


    */

    static  void sayHi(){
            System.out.println("Hi...");
    }

    static void formatSpecifier(String name,String game,int fame){
        //but use printf instead of println
            System.out.printf("%s plays %s and has %d followers on Social media.",name,game,fame);
    }


    static double sqrIt(double a){
        return a*a;
    }

    // static String


    public static  void  main(String[] args){
        // System.out.print("TESTING");



        sayHi();
        formatSpecifier("Dhoni","cricket",500000);

        System.out.println();
        // sqrIt(2);  directly calling it will not provide output , store it in a variable.

        double result = sqrIt(5);

        System.out.println(result);
        
        System.out.println(sqrIt(9));

        System.out.println("abcd".length());

        
        
    }
}