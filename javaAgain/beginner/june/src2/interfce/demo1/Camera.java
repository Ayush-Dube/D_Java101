package interfce.demo1;

public interface Camera {

	void takePhoto();

	void recordVideo();
	
	default void selfie() {
		System.out.println("🤳 taking simple non-abstract selfie");
	}
	
	static void slowMo() {
		System.out.println("🖼️ taking Slow motion shot....");
	}
	
}
