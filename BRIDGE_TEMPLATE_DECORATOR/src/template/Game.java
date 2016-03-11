package template;

public abstract class Game {
	abstract void initilize();
	abstract void startPlay();
	abstract void endPlay();
	
	//ensures the same sequence of events for every type of game 
	//-- this is the template to be followed
	public void play(){
		initilize();
		startPlay();
		endPlay();
	}

}
