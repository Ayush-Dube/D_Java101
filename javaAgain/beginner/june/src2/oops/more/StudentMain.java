package oops.more;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		//observe how the initial values are given,inabsense of a Construtor
		System.out.println(s1.name);
		System.out.println(s1.sem);
		System.out.println();
		
		s1.name = "Ambr";
		s1.sem = 5;
		s1.branch = "Civil";
		
		System.out.printf("%s,%d,%s %n",s1.name,s1.sem,s1.branch);
		
		//But the problem is, this is not secure
		//values can be changed 
		
		s1.name = "Bobby";
		
		System.out.println(s1.name);
		
		//Now lets see Encap Student
		StudentE se1 = new StudentE();
		
		System.out.println(se1);
		//can not acces name ,bcoz private
//		System.out.println(se1.name);
		System.out.println(se1.getName());
		

	}

}
