public class GitJava1{

    static String name = "Alpha";
    // String name = "Alpha";

    public static void main(String[] args){

        String name = "Bravo";

        System.out.println(name);
    
        // System.out.println(this.name); //not executing 
        System.out.println(GitJava1.name);


        //so , this cannot be used inside a main method
        //then , when to use this in java

       // Inside static methods (like main) → Error ❌ can not use
        

    }
}