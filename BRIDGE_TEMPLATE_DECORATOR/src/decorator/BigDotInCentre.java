package decorator;

public class BigDotInCentre extends ShapeDecorator {

	public BigDotInCentre(Shape shapeDecorated) {
		super(shapeDecorated);
	}

	@Override
	public void draw() {
		shapeDecorated.draw();
		drawDotInCentre(shapeDecorated);
	}
	
	private void drawDotInCentre(Shape shapeDecorated){
		System.out.println("Big Dot in Centre");
	}

	
}
