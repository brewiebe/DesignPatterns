package adapterQ5;

public class SquarePegAdapter {
	
	SquarePeg sp;
	
	public SquarePegAdapter(double width){
		sp = new SquarePeg(width);
	}
	
	public void setWidth(double d){
		sp.setWidth(d);
	}
	
	
	//used only for printing maximum hole size at beginning of output
	public void maxHole(RoundHole hole){
		System.out.println("RoundHole: max SquarePeg is "+ Math.sqrt(2) * hole.getRadius());
	}
	
	//adapts square peg to fit the round hole given
	
	public void adaptPeg(RoundHole hole){
		int radius = hole.getRadius();
		
		double maxPegSize = Math.sqrt(2) * radius;
		
		double currentSize = sp.getWidth();
		double reduceBy = 0;
		
		// if the peg is larger than the maximum peg size compute difference
		if(maxPegSize < currentSize){
			reduceBy = currentSize - maxPegSize;
		}
		
		System.out.println("Reducing SquarePeg of " + currentSize + "by " + reduceBy + " amount" );
		
		//if reduction of peg is needed
		if(reduceBy > 0){
			setWidth(currentSize - reduceBy);
			System.out.println("width is now " + sp.getWidth());
		}
	}
}
