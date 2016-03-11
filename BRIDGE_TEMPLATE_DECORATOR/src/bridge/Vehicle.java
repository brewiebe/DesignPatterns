package bridge;

public abstract class Vehicle {
	Workshop assemble = new Assemble();
	Workshop produce = new Produce();
	
	public void manufacture() {
		produce.work();
		assemble.work();
	}
}
