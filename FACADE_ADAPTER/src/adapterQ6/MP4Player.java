package adapterQ6;

public class MP4Player implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String filename) {
		// I can't play VLC
	}

	@Override
	public void PlayMP4(String filename) {
		System.out.println("Playing MP4: " + filename);
	}
}
