package template;

public class Football extends Game {

	@Override
	void initilize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Football Game Started. Enjoy the game! \n Go 49ners !! Beat SeaHawks !!");
	}

	@Override
	void endPlay() {
		System.out.println("Football Game Finished!\n");
	}

}
