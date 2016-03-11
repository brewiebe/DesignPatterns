package decorator;

public class RedBorderDecorator extends ShapeDecorator {

	public RedBorderDecorator(Shape shapeDecorated) {
		super(shapeDecorated);
	}

	@Override
	public void draw() {
		shapeDecorated.draw();
		colorBorderRed(shapeDecorated);
	}
	
	private void colorBorderRed(Shape shapeDecorated){
		System.out.println("Border Color: Red");
	}

	
}
