package decorator;

public class DiagonalCrossDecorator extends ShapeDecorator {

	public DiagonalCrossDecorator(Shape shapeDecorated) {
		super(shapeDecorated);
	}

	@Override
	public void draw() {
		shapeDecorated.draw();
		drawDiagonalCross(shapeDecorated);
	}
	
	private void drawDiagonalCross(Shape shapeDecorated){
		System.out.println("Big Diagonal Cross");
	}

	
}
