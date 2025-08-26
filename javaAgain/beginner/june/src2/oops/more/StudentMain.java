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
		se1.setName(null);
		se1.setName("");
		se1.setName("Indus");
		System.out.println(se1.getName());
		se1.setName("Ganga");
		System.out.println(se1.getName());
		
		
		//class StudentE1
		
		StudentE1 sE101 = new StudentE1("Amazon");
		System.out.println(sE101);
		System.out.println(sE101.getName());
		sE101.setBranch("Mechanical Engineering");
		sE101.setSem(3);
		System.out.println(sE101.getSem());
		System.out.println(sE101.getBranch());
		//Now see, in this case u can assign the name only once using constructor 
		//since all parameters are private therfore u cannot access them directly 
		
		
		//class StudentE2
		StudentE2 s2e = new StudentE2("Nile","Electrical",8);
		
		System.out.println(s2e.getName());
		System.out.println(s2e.getBranch());
		System.out.println(s2e.getSem());
		
		
		

	}

}
