package nestedRules;

public class DepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department cv = new Department("Civil Engineering");
		Department ec = new Department("Electronics Engineering");
		
//		Department cvStd1 = cv.new Student("Adam");
//		Department.Student cvStd1 = cv.new Department.Student("Adam");
		Department.Student cvStd1 = cv.new Student("Adam");
		cvStd1.details();
		
		Department.Student cvStd2 = ec.new Student("X -men"); //this ec.new actually makes the student of the ec dept
		Department.Student ecStd2 = ec.new Student("batman"); //this ec.new actually makes the student of the ec dept
		cvStd2.details();
		ecStd2.details();
		
		//tou observe krne vali baat hai ki top class ka object decide kr raha ,
		//which dept the inside student will belong to
		//if they have been made using ec.new then electronics , if cv.new then civil 
		//but pay attention to the variable name , it can be any thing , therfore u see that u named a student as cvStd2
		//but that student was created using ec.new and hence placed in Electronics dept
		
//		Department.Teacher tchr1 = now a object of dept require.new callConstructor();
		Department.Teacher tchr1 = cv.new Teacher("JohnCena");
		Department.Teacher tchr2 = ec.new Teacher("Kane");
		tchr1.details();
		tchr2.details();
		
		//👆Now observe here that the details method has common name in both Teacher & Student class 
		//but its function depend on the returnType CLass at the beginning of the sentence.
		
		Department.Principal pr = new Department.Principal("Undertake");
		pr.details();

		/*
		 * object tou banan padyga bs outer object nahi banan hoga , static class ke case mei
		 * 👉 Static nested class ka simple rule:
		✅ Uska apna object banana padega (agar tum uske non-static constructor, fields, ya methods use kar rahe ho).
		❌ Outer class ka object nahi banana padega (kyunki woh static hai, woh outer instance se bind nahi hai).
		 */
		
		//🚩🚩
		/*
		 * 
		 *  ✅ Agar Principal mein sab kuch static hota toh?
			
			Agar Principal class ka sab kuch static hota:			
			
			static class Principal {
			   static String prName = "Xavier";
			
			   static void details() {
			       System.out.println("Principal is " + prName);
			   }
			}
			Tab:						
			Department.Principal.details(); // ✅ Direct, bina object banaye.
			Tab koi new nahi chahiye! 
		 * */
		
		
		
	}

}
