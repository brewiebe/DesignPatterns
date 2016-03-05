package facadeQ3;

public class MobilePhone {
	private String modelNumber;
	private double price;
	
	public MobilePhone(String modelNumber, double price){
		this.modelNumber = modelNumber;
		this.price = price;
	}
	
	public void diplayModelNumber() {
		System.out.println(modelNumber);
	}
	public void displayPrice(){
		System.out.println(price + "US");
	}
}
