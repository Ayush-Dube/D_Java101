package testing;

public class ObjectCall {
	
	static String schoolName = "Air force School";
	
	String name;
	int marks;
	
	public ObjectCall(String name,int marks) {
		this.name=name;
		this.marks=marks;
		
	}
	
	static void classMethod() {
		System.out.println("classMethod acitvated...");
	}
	
	public void instanceMethod() {
		System.out.println("instanceMethod activated");
	} 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("chk");
		
		System.out.println(ObjectCall.schoolName);
		ObjectCall.classMethod();
		
		ObjectCall x = new ObjectCall("Diamond Gold",91);
		x.instanceMethod();
		System.out.println(x.name+" got "+x.marks+" marks.");
		
		//now the doubt is can i call static methods or variables using the object variable
		System.out.println(x.schoolName);
		x.instanceMethod();
		
	}

}
