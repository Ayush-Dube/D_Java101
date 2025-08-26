package oops.more;

public final class StudentE2 {

	private final String name;
	private final String branch;
	private final int sem;
	// all feilds are non-accessible directly.
	// all are finalised.

	// Construcutor
	public StudentE2(String name, String branch, int sem) {
		this.name = name;
		this.branch = branch;
		this.sem = sem;
	}
	
	//allow acces to feilds ,only to show not to change
	public String getName() {return this.name;}
	public String getBranch() {return this.branch;}
	public int getSem() {return this.sem;}

}

/*
 * 
 * public final class Student { //⚡observe->"final class" kr di,inheritance
 * Blocked. private final String name; private final String branch; private int
 * sem;
 * 
 * public Student(String name, String branch, int sem) { this.name = name;
 * this.branch = branch; this.sem = sem; }
 * 
 * public String getName() { return name; } public String getBranch() { return
 * branch; } public int getSem() { return sem; }
 * 
 * //but if u want to change the sem every six-months. // use a setter method by
 * removing the final keyword from sem. public void setSem(int
 * sem){this.sem=sem;} }
 */
