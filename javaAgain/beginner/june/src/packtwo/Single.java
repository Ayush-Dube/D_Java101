package packtwo;


public class Single {
	//I want that only one instance of this class can be made.
	
	
	//statement One
	private static Single single;
		
	private Single() {
		
	}
	
	public static Single getInstance() {
		if(single==null) {
			single = new Single();
		}
		return  single;
	}
	

}
