package interfce.demo1;

public interface MusicPlayer {

	void playMusic(String song);

	void stopMusic();
	
	//after further learning interrface,I came acroos static variables inside a interface
	//we will here see how to use it.
	
	//so varaibles in an interface are public static final
	//they can be accessed directly using InterfaceName and can not be changed
	
	int volumeLimit = 100;
	int minVolume = 0;
	
	default void color() {
		System.out.println("Black color default method inside interface");
	}
	
	static void battery() {
		System.out.println("2 AA battery cells required.");
	}
	

}
