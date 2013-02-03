package main.java.firstTest;

public class TestObject{
	
	private String name;
	private int number;
	
	/**
	 * 
	 * @param name
	 * @param number
	 */
	public TestObject(String name, int number){
		this.name = name;
		this.number = number;
	}
	
	//Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

}
