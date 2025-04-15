
import java.util.Scanner;
public class Bank{

    static Scanner scn = new Scanner(System.in);
    //methods can not inside of each other.
   
    static void showBalance(double a){
        System.out.printf("$ %.3f \n",a);
    }

    static double desposite(){
        double amount;

        System.out.println("Enter an amount to be deposited: ");
        amount = scn.nextDouble();

        if(amount<0){
            System.out.println("Amount can't be negative");
            return 0;            
        }
        else{
            return amount;
        }

    }

    static double withdraw(double any){
        double amount;

        System.out.println("Enter amount to be taken out : ");
        amount=scn.nextDouble();

        if(amount>any){
            System.out.println("Not enough balance...");
            return 0;
        }
        else if(amount<0){
            System.out.println("amount cant be negative...");
            return 0;
            
        }
        else{
            return amount;
        }
    }



    public static void main(String[] args){

       

        //so is it that we can not write a method inside the main method
        double balance=0;
        boolean isRunning = true;
        int choice;
        
        while(isRunning){
                
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposite");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.print("Enter your choice(1-4): ");
            choice = scn.nextInt();

            switch(choice){
                case 1 :
                    // System.out.println("blanace");
                    showBalance(balance);
                    System.out.println();
                    break;
                case 2 :
                    balance = balance + desposite();
                    break;
                case 3 :
                    // System.out.println("withdraw");
                    balance = balance - withdraw(balance);
                    break;
                case 4 :
                    System.out.println("Exiting now...");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Enter valid Choice");
            }

        }


    scn.close();
    }
}