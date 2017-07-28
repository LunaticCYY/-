package Adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "In the end.mp3");
		audioPlayer.play("mp4", "1.mp4");
		audioPlayer.play("vlc", "2.vlc");
		audioPlayer.play("avi", "3.avi");
	}

}
