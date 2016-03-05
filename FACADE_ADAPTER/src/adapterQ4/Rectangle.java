package adapterQ4;

public class Rectangle implements Shape {

	private LegacyRectangle adapt = new LegacyRectangle();
	
	/* rather than computing size in main now dimensions are converted in this class to adapt the legacy
	 * rectangle to use the shape interface 
	*/
	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		adapt.draw(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
		
	}

}
