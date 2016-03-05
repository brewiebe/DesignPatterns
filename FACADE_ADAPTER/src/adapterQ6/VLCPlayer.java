package adapterQ6;

public class VLCPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String filename) {
		System.out.println("Playing VLC: " + filename);

	}

	@Override
	public void PlayMP4(String filename) {
		// I can't play MP4

	}

}
