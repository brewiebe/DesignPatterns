package facadeQ2;

public class FacadeClass {
	private int number;
	public FacadeClass(int number){
		this.number = number;
	}
	
	public void doThings(){
		Class1 c1 = new Class1();
		System.out.println("Cube of " + number + ": "+c1.doSomethingComplicated(number));
		Class2 c2 = new Class2();
		System.out.println("Cube of " + number + " times 2: " + c2.doAnotherThing(c1, number));
		Class3 c3 = new Class3();
		System.out.println(number + " to sixth power times 2: " + c3.doMoreStuff(c1, c2, number));
	}
}
