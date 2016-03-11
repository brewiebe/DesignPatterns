package template;

public class TemplateTest {

	public static void main(String[] args) {
		Game hockey = new Hockey();
		Game basketball = new Basketball();
		Game football = new Football();
		
		hockey.play();
		basketball.play();
		football.play();
	}

}
