package template;

public class Hockey extends Game{

	@Override
	void initilize() {
		System.out.println("Hockey Game Initialized! Start playing.");		
	}

	@Override
	void startPlay() {
		System.out.println("Hockey Game Started. Enjoy the game! \n Hey Wayne Gretzky is the new Head Coach for the Oilers");		
	}

	@Override
	void endPlay() {
		System.out.println("Hockey Game Finished!\n");
	}
	

}
