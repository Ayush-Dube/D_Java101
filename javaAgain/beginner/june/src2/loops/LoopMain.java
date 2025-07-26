package loops;

public class LoopMain {

	public static void main(String[] args) {
		
		//i++ vs ++i , ek sath 2 kaam,
		
//		int  i = 0 ;			
//		int a = 2 +i;
////		int a = ++i;
//		int a = i++;
//		
//		System.out.println(a);
//		System.out.println(i);
		
		/*
		 	1.while loop
		 	
		 	while(condition){
		 	   //program
		 	}
		 	
		 	int i=0;
			while(i<=10) {
				System.out.printf("I m number:-%d \n",i);
				i++;
//				break;
		}
		  
		    2. do while 
		    
		    do{
		    }while(condition)
		    
		    does run for the first time
		    
		    int i=0;
			boolean isAvailable = false;
		
			do {
				System.out.println("Printing number:- "+i);
				i++;				
				}while(i>10);
				👉 even though the condition is wrong but atleast for the first time it will run.
				
				
			3. for loop
			
			for(initialisation;condition;update){
				//code 
				//can apply break or continue
			}
			
			- multiple initialisation , multiple condition can also be performed.
			
			dekh bhai ,in while or do while condition ke variable outer scope mei hoty hain .
			
			but for loop mei scope within the for block hota hai.
			
			initialisationn ke variable , subsequent code mei use ho sakty hai.
			
			
				
		
		  
		 
		  */
		
//		for(int i = 0;i<6;i++) {
////			System.out.println(10^i);
//			System.out.println((int)Math.pow(10,i));
//			}
//		}
		
		
		for(int i = 1,j = 1;j<=100000;j=j*10){
		  System.out.println(i*j);	
		}
		
		System.out.println();
		System.out.println("example_1");
		System.out.println("================");
		
		for(int i=0;i<=5;++i){
//			System.out.println(i*"*");
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i =1;i<=5;i++) {
			System.out.println("*".repeat(i));
		}
		

	}		
		
		
}		
			
			
		

