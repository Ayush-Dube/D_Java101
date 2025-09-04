package interfce.demo1;

public class Demo1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone nokia = new SmartPhone();
		
		//que1 - i think i can not have constructor in interfaces, so what if i want to pass a name of the phone
		// SmartPhone nokia = new SmartPhone(modelName);
		
		nokia.takePhoto();
		nokia.recordVideo();
		nokia.playMusic("Payphone");
		nokia.stopMusic();
		nokia.call("9876543210");
		nokia.answer();
		
		nokia.selfie();
		Camera.slowMo();
		nokia.slowMo();

	}

}

/*
 * 		Interface MyInterface{ 
 * 			void method1(); //implicitly public + abstract
 * 			int method2();  //implicitly public + abstract  
 * 		}
 *  	
 *  	Default Nature
 *  	 - all methods are PUBLIC and ABSTRACT (unless you use default or static for making normal methods).
 *  	 - all variables in a interface are PUBLIC STATIC FINAL -->constants
 *  
 *  	class C implements A,B
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * */
