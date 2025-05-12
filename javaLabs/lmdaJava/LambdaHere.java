/*
   - anonymous class with only one method
   - interface

   Pay attention here:-
   if i have a interface ,it will have a abstract method inside it.
   then u have to make a concrete class which will implement the abstract method of interface.
   then that concrete class will be used by the main method of some class  to make the object of the interface , so eventually this is thhe flow of things.

   Using lambda you can skip the concrete class creation ,after java 8,no concrete clas required❌

   Interface will act as the Type class for the the lambda function 
   int x = 1;
   String name = "Ambr Stone";
   similarly ,Interface will act as int/String here , return type.

   now, in lambda expression ,write the implementation of the Interface method.
   "Single Abstract Method" (SAM) or "Single Method Interface" (SMI) rule.



   Haan yaar, samajh aata hai — initially lagta hai ki lambda expression likhne ke liye bhi interface banana pad raha hai, toh kya fayda? 😅

   But here's the actual intent and convenience behind lambda expressions in Java:

        🔹 1. You’re NOT supposed to always create your own interfaces
        Java already provides many built-in functional interfaces in java.util.function package:

        Interface------------- Abstract Method----------------Description
        Runnable--------------	run()	     -----------------No input, no return
        Consumer<T>-----------	accept(T t)	 -----------------Takes input, returns nothing
        Supplier<T> ----------	get()	     -----------------No input, returns something
        Function<T, R>--------	apply(T t)	 -----------------Input and output
        Predicate<T>----------	test(T t)	 -----------------Returns true/false

        So, in real projects, you rarely create your own interface just for a lambda. You usually reuse these.
        
*/

public class LambdaHere {
    public static void main (String[] args){

        // LambdaInterface obj = ()-> {System.out.println("lambda here ");};
        LambdaInterface   obj = ()-> System.out.println("lambda here ");
        // retrun type  //objName     //operation
        obj.methodA();

       
            
    }

}    