package adapterQ6;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		//play all different types of files 
		audioPlayer.play("MP3", "Pump It - Black Eyed Peas.mp3");
		audioPlayer.play("MP4", "Poker Face - Lady Gaga.mp4");
		audioPlayer.play("VLC", "Sorry - Justin Bieber.vlc");
	}

}
