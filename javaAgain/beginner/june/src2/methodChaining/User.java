package methodChaining;

// yanha Method Chaining aur nested Class dono kaam krty hain .
public class User {	
	String name;
	int age;
	
	//String name1;
	
	static class Builder{
		String name;
		int age;
		
		Builder setName(String name) {
			this.name =name;
			return this;
		}
		
		Builder setAge(int age) {
			this.age = age;
			return this;
		}
		
		User build() {
			return new User(this); 
		}
		
	}
		//now since the constructor of User will be called ,with "this" parameter
		//default User Constructor will not work 
		//therefore make a new Constructor which can handle paratmemter "this"
		//so "this" - is basically a reference to the Builder type object .
		//so your constructor should be able to handle the parameters which are of Builder Type.
		
		//we will make a constructor which will convert the Builder type object to User type object.
	    
		//nested Class ke case mei tou khud ka constructor banana padyga
		
		User(Builder obj){
			this.name=obj.name;
			this.age =obj.age;			
		}
		
		void details() {
			System.out.println(name +" is "+age+" years old.");
		}		

}

/*
 * 		User u  = new Builder() --> Builder class ka object create hota hai,hidden construtor of Builder cls runs, 0A2xb7 reference created
 *					  .setName("Dube") --> setName call hota hai ,  value set hoti hai  , phir se reference return ho jata hai
 *					  .setAge(21)  --> usi object ka setAge method called, value set, return the reference
 *                    .build() --> reference is passed as a parameter to convert the Builder object into User object.
 *                    
 *                    
 *      Now ,also observe this
 *      
 *      return new User(this) --> yanha hum ek reference pass kr rahe hain , 
 *      						  ek builder object already bn gya tha , bs uska hi refernce hai...
 *      							
 *      						  - observe ki User aur Builder both have same variable names 
 *      						  - there fore they change using this.name=obj.name;this.age=obj.age
 *       _______________________
 *      |Pass by value/reference|
 *       
 *       
 *		- primitive vs nonPrimitive datatype 
 *      - primmitive mei simple values hoti hain jo directly pass ho jati hai , pr nonPrimitive complex dataTypes hoty hain,
 *      - which carries wide range of info/data.
 *      - therefore thry are passed as reference.
 *      
 *      //case1
 *      int a = 5 ;
 *      A obj = new A(a);
 *      
 *      A(int a){}
 *      No reference is passed , the actual values are passed.
 *      
 *      
 *      //case2
 *      Student s = new Student("praka",29);
 *      - now imagine s in an object that info inside 's', s.name,s,age
 *      - some other method or class that may require s as an input
 *      - X ins = new X(s);
 *                - in this case "s" ka reference is passed
 *                
 *      String s = "hello";
 *      new A(s); --> s ka reference pass hota hai , bcoz s is nonPrimmitive
 *      
 *      
 *      //return new User(this) mei Builder object reference pass ho raha hai
 *                - and User(Builder xyz){ }
 *                  means that it is expecting a Builder class object(reference) only
 *     
 *        
 *        
 *        
 *            
 *      
 *      
 *      
 *      
 * 
 * 
 * 
 * 
 */
