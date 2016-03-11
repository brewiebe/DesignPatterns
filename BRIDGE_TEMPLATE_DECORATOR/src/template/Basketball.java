package template;

public class Basketball extends Game {

	@Override
	void initilize() {
		System.out.println("Basketball Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Basketball Game Started. Enjoy the game! \n This is Kobe's last game with the Lakers");
	}

	@Override
	void endPlay() {
		System.out.println("Basketball Game Finished!\n");
	}
	
}
