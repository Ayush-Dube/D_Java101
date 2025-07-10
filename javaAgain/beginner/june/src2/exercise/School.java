package exercise;

public class School {
	
	
	class Civil {
		
		Civil(){
			System.out.println("Construcuotr of Civil called");
		}
		
		class Rcc {
			Rcc(){
				System.out.println("Construcutor of Rcc called");
			}
		}
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		School sch = new School();
		
		Civil cv = sch.new Civil();
		
		Civil.Rcc rc = cv.new Rcc();
		

	}

}

/*
	Ab suppose ek alag class bana di:
	
			package exercise;
			
			public class College {
			    public static void main(String[] args) {
			        // School ka object banao
			        School sch = new School();
			
			        // Civil ka object banao
			        School.Civil cv = sch.new Civil();
			
			        // Rcc ka object banao
			        School.Civil.Rcc rc = cv.new Rcc();
			    }
			}
*/
