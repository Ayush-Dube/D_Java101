package nestedRules;

public class Department {
	
	String deptName;
	
	
	//constructor
	Department(String deptName) {
		this.deptName = deptName;
		System.out.printf("%s dept created...%n",deptName);
	}
	
	class Student {
		
		String stdName;
		
		//construcutor
		Student(String stdName){
			this.stdName = stdName;
			System.out.println("a student created...*");
		}
		
		void details() {
			System.out.printf("%s belongs to %s department%n",stdName,deptName);
		}		
	}
	
	//static class ,bcoz Principal will be same for all student and departments and also for teachers. 
	
	static class Principal{
		
		String prName;
		
		Principal(String prName){
			this.prName=prName;
			System.out.println("Principal created...");
		}
		
		void details() {
			System.out.printf("%n Present Principal of College is Shri.%s %n",prName);
		}
	}
	
	
	
	//esko non static rakho ,because teachers have defferent departments, but prinipal is common to all
	class Teacher{
		String tchrName;
		
		Teacher(String tchrName) {
			this.tchrName=tchrName;
			System.out.println("teacher constructor...");
		}
		
		void details() {
//			System.out.printf("shri.%s teaches in %s Department%n",deptName,tchrName);
//			System.out.printf("shri.%s teaches in %s Department%n",this.deptName,tchrName);
			System.out.printf("Shri.%s teaches in %s Department%n",tchrName,deptName);
		}
	}
	
	

}
