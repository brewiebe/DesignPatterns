package decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		
		System.out.println("Circle with normal border");
		Shape circle = new Circle();
		circle.draw();
		
		System.out.println("\nCircle of red border");
		RedBorderDecorator redCircle = new RedBorderDecorator(circle);
		BigDotInCentre redBorderDotCircle = new BigDotInCentre(redCircle);
		redBorderDotCircle.draw();
		
		System.out.println("\nRectangle with normal border");
		Shape rectangle = new Rectangle();
		rectangle.draw();
		
		System.out.println("\nRectangle of red border");
		RedBorderDecorator redRectangle = new RedBorderDecorator(rectangle);
		DiagonalCrossDecorator redRectCross = new DiagonalCrossDecorator(redRectangle);
		redRectCross.draw();
		
		System.out.println("\nTriangle with normal border");
		Shape triangle = new Triangle();
		
		System.out.println("\nTriangle with star on the top");
		StarOnTopDecorator triangleStar = new StarOnTopDecorator(triangle);
		triangleStar.draw();
		
		
	}

}
