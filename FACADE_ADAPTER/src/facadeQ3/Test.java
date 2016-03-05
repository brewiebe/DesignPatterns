package facadeQ3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		boolean running = true;
		Scanner in = new Scanner(System.in);
		ShopKeeper sk = new ShopKeeper();

		while (running){
			sk.selectionMenu();
			int choice = in.nextInt();
			if(choice==4){running=false;}
			else{
				sk.choosePhone(choice);
			}
		}
	}
}
