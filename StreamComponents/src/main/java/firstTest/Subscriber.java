package main.java.firstTest;

public class Subscriber {
	
	private int numberOfMessages;
	private String name;
	private String [] messages;

	public void receive(String message) {
		System.out.println("subscriber received: " + message);
	}
	
	/**
	 * empty constuctor
	 */
	public Subscriber(String name, int numberOfMaxMessages){
		this.setName(name);
		this.setMessages(new String [numberOfMaxMessages]);
	}
	
	public void riseNumberOfMessages(){
		this.numberOfMessages++;
	}

	public int getNumberOfMessages() {
		return numberOfMessages;
	}

	public void setNumberOfMessages(int numberOfMessages) {
		this.numberOfMessages = numberOfMessages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String [] getMessages() {
		return messages;
	}

	public void setMessages(String [] messages) {
		this.messages = messages;
	}

}
