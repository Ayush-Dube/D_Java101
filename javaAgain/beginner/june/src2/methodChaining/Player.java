package methodChaining;

	/*
		 but why use builder pattern
		 Player plr = new Player("Praka",29,"male","LeadStriker","StealthOps",8799);
		 
		 - age parameter signature aagy peechy huya ,tou error milygi;
		 - suppose there are total 7 parameter but you only provided 5 , tou error milygi;
		 
		 Constructor
		 - in Java every class has a constructor by default
		 - even though u might not have expllicityly written the constructor(though u can),
		 - even then a empty constructor is made by java
		      public Player(){
		        //empty
		      }		      
		 - but remember agr nested class ho , jaise ki User mei Builder class,then u have to make
		   User constructor excepting Builder class object as parameter
		   return new User(this)
		   
		 - User (Builder bld){
		 	this.name = Builder.name;
		 	this.age = Builder.age;
		 }
		 - the above operation converts the Builder object to User object.
		 
		 
		 Question:- What if we ourself write a constructor inside a Builer Pattern
		 
		 Player(name,age,gender,weapon,unit,service,score){
		 		this.name =name;
		 		this.age = age;
		 		this.gender = gender;
		 		this.weapon = weapon;
		 		this.unit = unit;
		 		this.score = score;
		 		this.service = service;		 
		 }
		 
		 Answer: - Nahi chalyga method chaining se, but traditional way mei chalyga ...mtlb sare paramtrs ek sath lekho
		 
		 Tou kya kare?
		 
		 Just write the empty constructor as well,in this way u can operate the class in both ways.
		 
		 
		 
		 
		 
	 */
	 
	 
	 



// no nested class
public class Player {
	String name;
	String gender;
	String weapon;
	String unit;
	String service;
	int age;
	int score;
	
	//observe no construtor written 
	//but a default constructor is provided by JVM.
	
	public Player setName(String name) {
		this.name = name;		
		return this;
	}
	
	public Player setGender(String gender) {
		this.gender = gender;		
		return this;
	}
	
	public Player setWeeapon(String weapon) {
		this.weapon = weapon;		
		return this;
	}
	
	public Player setUnit(String unit) {
		this.unit = unit;		
		return this;
	}
	
	public Player setService(String service) {
		this.service = service;		
		return this;
	}
	
	public Player setAge(int age) {
		this.age = age;		
		return this;
	}
	
	public Player setScore(int x) {
		this.score = x;		
		return this;
	}
	
	public Player printDeatails() {
		System.out.println("-------Player Deatails--------");
		System.out.println("Name: "+(name!=null ?name:" - "));
		System.out.println("Gender: "+(gender!=null ?gender:" - "));
		System.out.println("Age: "+(age !=0 ?age:" - "));
		System.out.println("Service: "+(service!=null ?service:" - "));
		System.out.println("Unit: "+(unit!=null ?unit:" - "));
		System.out.println("Weapon: "+(weapon!=null ?weapon:" - "));
		System.out.println("Score: "+(score!=0 ?score:" - "));
		System.out.println();
		return this;		
	}
	
	
}
