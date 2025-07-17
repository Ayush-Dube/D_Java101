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
