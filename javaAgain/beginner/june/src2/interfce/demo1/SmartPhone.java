package interfce.demo1;

public class SmartPhone implements Camera, MusicPlayer, Telephone { // observe the multiple inheritaance
	
	@Override
	public void takePhoto() {
		System.out.println("📷 Taking a pic with 108MP camera");
	}
	@Override
	public void recordVideo() {
		System.out.println("🎥 Recording 4K video");
	}
	@Override
	public void playMusic(String song) {
		System.out.println("🎶 Playing: "+song);
	}
	@Override
	public void stopMusic() {
		System.out.println("⏹️ Music stopped");
	}
	@Override
	public void call(String number) {
		System.out.println("📞 Calling " +number);
	}
	@Override
	public void answer() {
		System.out.println("📲 Answering the call");
	}
	
	
	//for Anonymous class purpose
	public void randomMethod() {}
	
	
	int volume = 50;
	public void increaseVol() {
		if(volume<MusicPlayer.volumeLimit) {
			volume++;
			System.out.println("volume: "+volume);
		}
		else {
			System.out.println("Maximum volume reached");
		}
	}


}
