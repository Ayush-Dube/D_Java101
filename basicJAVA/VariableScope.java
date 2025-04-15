public class VariableScope{

    // String outerVariable = "I am a outer variabl value.";   // since its not static ,can not be used directly

    static String outerVariable = "I am a outer variable value1.";

    int x = 1;

    // Even if outside method is static , can we still make a object of it ??

    void printX(){
        
        System.out.println(x);
    }

    void useThisX(){
        // int x = 7;
        // System.out.print(this.x);
        System.out.print(x);
    }



    public static void main(String[] args){

        String outerVariable = "Inside main method VairableValue.";
        int x =5;

        VariableScope obj = new  VariableScope();

        System.out.println();
        System.out.println(outerVariable+" and x  is "+x);
        System.out.println(obj.outerVariable+" and x is "+obj.x);
        System.out.println();
        System.out.println(x);
        obj.printX();
        obj.useThisX();


        //can not use this inside static method
        // System.out.println(this.x);

       


    }
}


// local -->in a house
// global -->out on a street

// use of 