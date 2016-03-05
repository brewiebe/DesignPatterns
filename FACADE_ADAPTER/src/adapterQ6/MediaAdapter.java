package adapterQ6;

public class MediaAdapter implements MediaPlayer {


	AdvancedMediaPlayer advancedMediaPlayer;
	
	//decide which type of media player to use then instantiate it and play
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equals("VLC")){
			advancedMediaPlayer = new VLCPlayer();
			advancedMediaPlayer.playVLC(fileName);
		}
		else if (audioType.equals("MP4")){
			advancedMediaPlayer = new MP4Player();
			advancedMediaPlayer.PlayMP4(fileName);
		}
		
	}

}
