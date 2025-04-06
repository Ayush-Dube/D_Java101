public class GitJava1{

    static String name = "Alpha";
    // String name = "Alpha";


    public void showMsg(){
        System.out.println("Global name : "+ this.name);
    }

    public static void main(String[] args){

        String name = "Bravo";

        System.out.println(name);
    
        // System.out.println(this.name); //not executing 
        System.out.println(GitJava1.name);


        //so , this cannot be used inside a main method
        //then , when to use this in java

       // Inside static methods (like main) → Error ❌ can not use

       // showMsg();  //this did not work because u did not instantsiated the non static method;
       GitJava1 obj1 = new GitJava1();
       obj1.showMsg();


        

    }



}