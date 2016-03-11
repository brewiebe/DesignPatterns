package decorator;

public class StarOnTopDecorator extends ShapeDecorator {

	public StarOnTopDecorator(Shape shapeDecorated) {
		super(shapeDecorated);
	}

	@Override
	public void draw() {
		shapeDecorated.draw();
		drawStarOnTop(shapeDecorated);
	}
	
	private void drawStarOnTop(Shape shapeDecorated){
		System.out.println("Star On Top");
	}

	
}
