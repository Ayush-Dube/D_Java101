

package oops.more;


public class StudentE {
	private String name;
	private String branch;
	private int sem;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;

		} else {
			System.out.println("Can not be Null or empty");
		}
	}
	
	public void setBranch(String branch) {this.branch = branch;}
	public String getBranch() {return this.branch;}
	
	public void setSem(int sem) {this.sem = sem;}
	public int getSem() {return this.sem;}

}



/*
 * In the above code you can not access the fields directly but still you can
 * change the them again and again,which is sometimes unacceptable.
 * Therfore,design in such a way that only feilds that are required to change
 * are mutable and some are totally restricted(immutable).
 */

//Approach 1 -->No setter,Only getter ,final keyword
//Approach 2 -->Immutable class,Only Constructor, private final feild, fianl class. 





