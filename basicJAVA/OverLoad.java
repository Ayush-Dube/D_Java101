public class OverLoad{

    int addMethod(int a,int b){
        return a+b;
    }

    String addMethod(String a,String b){
        return a+" "+b;
    }

    //The parameter Signature should be different from the previous method , then it will work properly
    // return type does not matter.
    //Different Parameter Signature.


    public static void main(String[]args){

        OverLoad obj = new OverLoad();

        System.out.println(obj.addMethod(7,5));
        System.out.println(obj.addMethod("Very","Cool"));

        
    }
}