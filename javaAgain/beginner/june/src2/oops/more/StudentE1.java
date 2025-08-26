package oops.more;

//No setter,only getters, final private feilds 
public class StudentE1 {
	
	private final String name;
	private String branch;
	private int sem;
	
	public StudentE1(String name){
		this.name=name;
	}
	
	public String getName() {return this.name;}
	
	//but for branch and sem you have to make setter methods.Bcoz no constructor for them.
	public void setBranch(String branch) {this.branch=branch;}
	public String getBranch() {return this.branch;}
	
	public void setSem(int sem) {this.sem = sem;}
	public int getSem() {return this.sem;}
	
	
	

}
