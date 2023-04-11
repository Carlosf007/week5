package week5;

public class AsteriskLogger implements Logger {
	
	public void log(String message) {
		System.out.println("***" + message + "***");
	}
	
	
	public void error(String message) {
		System.out.println("****************");
		System.out.println("***Error: " + message + "***");
		System.out.println("****************");
		
	}
}