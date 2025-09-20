package errorhandling;

public class CustomExcep extends Exception {
		
		String msg = "Invalid age";
	
		CustomExcep(String msg){
			super(msg);
		}
	

}
/*    
 *     we need the inheritance concept here 
 *     
 *
 *   - duplicateEmail
 *   - ageException
 *   - userSpecific
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */