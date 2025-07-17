package methodChaining;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User usr = new User.Builder()
						    .setAge(31)
						    .setName("Praka")
						    .build();
		
		usr.details();
		
		
//		System.out.println(usr.name1);
		
		//Refer Instance Default Value 

	}

}
