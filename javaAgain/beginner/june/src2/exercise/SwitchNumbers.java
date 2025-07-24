package exercise;
//july24
import java.util.Scanner;

public class SwitchNumbers {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number between 1-9 : ");
		
		try {
			int x  = scn.nextInt(); //age ye try ke bhr hota tou ,
			//string dene pr error bhr hi aa jati aur try ko mauka hi nahi milta.
			
			//scn.close() ko last mei ek baar hi dena hai,
			//if you can out it in a finally block ,it will run always no clutter for later.
			
			//👉switch case can not be used with double ,float
			
			switch (x){
			case 1:
				System.out.println("ek");
				break;
				
			case 2:
				System.out.println("Do");
				break;
				
			case 3:
				System.out.println("teen");
				break;
				
			case 4:
				System.out.println("char");
				break;
				
			case 5:
				System.out.println("panch");
				break;
				
			case 6:
				System.out.println("Chayy");
				break;
				
			case 7:
				System.out.println("Saat");
				break;
				
			case 8:
				System.out.println("Aaath");
				break;
				
			case 9:
				System.out.println("Nou");
				break;
				
			default:
				System.out.println("invalid input enter a number b/w 1-9...");
				break;
			}
			System.out.printf("You have entered number : %d",x);
		}
		
		catch(Exception e) {			
			System.out.println("there was a runtime problem:- "+e);
		}
		finally {
			scn.close(); //what problem does it actually creates
		}
		
	}
		
}
		
	

