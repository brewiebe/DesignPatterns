package adapterQ4;

public class Line implements Shape {

	private LegacyLine adapt = new LegacyLine();
	
	/*
	 * legacy line is now adapted in this class to use the shape interface
	 */
	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		adapt.draw(x1, y1, x2, y2);
	}

}
