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
//		Camera.selfie(); // will not work because its a non-static method inside interface (using default keyword)
//		nokia.slowMo();
		//👉 Matlab nokia sirf runtime pe hi truly exist karta hai. Compile time pe bas "type checking" hota hai.

		
		//lets try anonymous class which I came across after learning interface
		
		SmartPhone motorola = new SmartPhone() {
			public void takePhoto() {System.out.println("Taking pic with 50MP camera");}
			public void recordVideo() {System.out.println("Recording in 2K...");}
			public void randomMethod() {System.out.println("random");}
			};
			
		motorola.takePhoto();
		motorola.recordVideo();
		motorola.randomMethod();
			//above line will not work because randomMethod is not available to be overridden
			//go to the parent class and declare it 
		
		//accessing static variables 
		System.out.println(MusicPlayer.minVolume +","+MusicPlayer.volumeLimit);
		System.out.println(nokia.minVolume +","+motorola.volumeLimit);
		/*
		 * But I dont understand why I cant access static method using Object reference but can access a variable
		 * using object reference.
		 * */
		
		MusicPlayer.battery();
//		motorola.battery();// gives error
		System.out.println(motorola.volumeLimit);//does not give error
		
		//private variable in implementing class
		nokia.increaseVol();
		nokia.increaseVol();
		nokia.increaseVol();
		nokia.increaseVol();
		nokia.increaseVol();
		
		System.out.println("----");
		motorola.increaseVol();
		motorola.increaseVol();
		motorola.increaseVol();
		motorola.increaseVol();
		
		
			
			
		}
	}



/*
 * 		Interface MyInterface{ 
 * 			void method1(); //implicitly public + abstract
 * 			int method2();  //implicitly public + abstract  
 * 		}
 *  	
 *  	1.Default Nature
 *  	 - all methods are PUBLIC and ABSTRACT (unless you use default or static for making normal methods).
 *  	 - all variables in a interface are PUBLIC STATIC FINAL -->constants
 *  	
 *  	2.Inheritance
 *  	class C implements A,B
 *  
 *      3.Since Java 8 
 *        - apart from abstract methods you can now add normal methods too.
 *        - But they have to be STATIC or DEFAULT
 *        - default void greet(){sysout("Hi...a normal method inside using default keyword ")}
 *        - static void greetings(){sysout("a static method using static keyword")}
 *        - in Java 9 , private methods also allowed.
 *        
 *      4.No Constructor
 *      
 *      5.Polymorphism with Interface
 *        - Animal a = new Dog()
 *        - a.eat()
 *        - Animal is a interface
 *        
 *      6.Loose Coupling 
 *      
 *      7.Example
            interface Flyable {
				    void fly();
				}
				
			interface Swimmable {
				    void swim();
				}
				
			class Duck implements Flyable, Swimmable {
				    public void fly() {
				        System.out.println("Duck flies low");
				    }
				    public void swim() {
				        System.out.println("Duck swims in water");
				    }
			}
				
			public class Main {
				    public static void main(String[] args) {
				        Flyable f = new Duck();   // Polymorphism
				        f.fly();
				        
				        Swimmable s = new Duck();
				        s.swim();
				    }
			}

 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * */
