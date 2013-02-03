package main.java.firstTest;

public class Publisher {
	
	//publisher with max. 10 subscribers
	private Subscriber [] subscribers;
	private int numberOfSubsribers;
	
	public Publisher(int numberOfMaxSubscribers){
		this.subscribers = new Subscriber [numberOfMaxSubscribers];
		this.numberOfSubsribers = 0;
	}

	public void add(Subscriber subscriber) {
		//adds subscriber to publisher if space is available
		if(this.numberOfSubsribers<this.subscribers.length){
			this.subscribers[this.numberOfSubsribers] = subscriber;
			this.numberOfSubsribers++;
		}
	}

	public void publish(String message) {
		//loop through all subscribers
		for (Subscriber i: this.subscribers) {
			i.riseNumberOfMessages();
			i.receive(message);
		}
	}

}
