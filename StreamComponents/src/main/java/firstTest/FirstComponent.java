package main.java.firstTest;

/**
 * tests for basic values numbers and strings
 * @author feininger
 *
 */
public class FirstComponent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
	
	/**
	 * 
	 * @return String Fertig
	 */
	public static String returnFertig(){
		return "Fertig";
	}
	
	/**
	 * 
	 * @return 5
	 */
	public static int return5(){
		return 5;
	}
	
	/**
	 * Timeout 20
	 * @return 5
	 * @throws InterruptedException 
	 */
	public static int return5WithTimeout() throws InterruptedException{
		Thread.sleep(90);
		return 5;
	}
	
	/**
	 * 
	 * @return 17.9
	 */
	public static double return179(){
		return 17.9;
	}
	
	/**
	 * 
	 *  @return NULL Object
	 */
	public static Object returnNull(){
		return null;
	}
	
	/**
	 * 
	 * @return initialized object
	 */
	public static Object returnNotNull(){
		Object obj = new Object();
		return obj;
	}

}
