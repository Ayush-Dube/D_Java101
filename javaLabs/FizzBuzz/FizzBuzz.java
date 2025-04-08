public class FizzBuzz{   //bhai class lekhna hai not static
    public static void main(String[] args){
          for (int i = 1; i <= 100; i++) {
            // TODO: Implement FizzBuzz logic here
            // HINT: Use the modulo operator (%) to check if a number is divisible by another number
            // HINT: Use System.out.println() to print the output
            // HINT: Remember that the order of the if-else statements matters

            // if(i%3==0){
            //     System.out.println("Fizz");
            // }
            // else if(i%5==0){
            //     System.out.println("Buzz");
            // }
            // else if(i%3==0 && i%5==0){
            //     System.out.println("FizzBuzz");
            // }
            // else{
            //     System.out.println(i);
            // }

            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }            
        }
    }
}