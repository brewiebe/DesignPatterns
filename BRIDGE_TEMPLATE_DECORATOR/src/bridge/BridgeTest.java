package bridge;

public class BridgeTest {
	public static void main(String[] args){
		Vehicle bike = new Bike();
		Vehicle car = new Car();
		
		car.manufacture();
		bike.manufacture();
	}

}
