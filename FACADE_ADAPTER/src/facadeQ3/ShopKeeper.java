package facadeQ3;

import java.util.Scanner;

public class ShopKeeper {
	private IPhone iPhone = new IPhone();
	private SamsungNote5Edge s = new SamsungNote5Edge();
	private BlackBerryZ10 bb = new BlackBerryZ10();
	
	public void selectionMenu(){
		
		System.out.println("============Mobile Shop==============");
		System.out.println("1. IPHONE");
		System.out.println("2. SAMSUNG");
		System.out.println("3. BLACKBERRY");
		System.out.println("4. EXIT");
		System.out.println("Enter your choice: ");
	}
	
	public void choosePhone(int choice){
		if(choice == 1){
			iPhone.diplayModelNumber();
			iPhone.displayPrice();
		}
		else if(choice == 2){
			s.diplayModelNumber();
			s.displayPrice();
		}
		else if(choice == 3){
			bb.diplayModelNumber();
			bb.displayPrice();
		}
	}
}
