package adapterQ6;

public class AudioPlayer implements MediaPlayer {

	
	MediaAdapter mediaAdapter = new MediaAdapter();
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equals("MP3")){
			System.out.println("Playing MP3: " + fileName);
		}
		//if audio player doesn't have capability to play file send
		//it to the adapter who decides how to play it
		else {
			mediaAdapter.play(audioType, fileName);
		}
		
	}

}
