package main.java.firstTest;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create test obj
		TestObject firstName5 = new TestObject("firstName", 5);
		//print attr of the test obj
		System.out.println(firstName5.getName());
		System.out.println(firstName5.getNumber());
		
		Subscriber subscriber = new Subscriber("sub1", 10);
		subscriber.receive("test2");
	}

}
