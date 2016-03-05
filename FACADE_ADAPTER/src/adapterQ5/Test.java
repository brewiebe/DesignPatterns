package adapterQ5;

public class Test {

	
	public static void main(String[] args) {
		SquarePegAdapter squarePegAdapter = new SquarePegAdapter(6);
		RoundHole hole = new RoundHole(5);
		
		//prints out size of maximum peg for hole radius
		squarePegAdapter.maxHole(hole);
		
		//loops through peg sizes 6 - 9 to demonstrate adapter
		for(int i = 6; i <= 9; i++){
			squarePegAdapter.setWidth(i);
			squarePegAdapter.adaptPeg(hole);
		}
	}
}
