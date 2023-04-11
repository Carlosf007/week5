package week5;

	public class SpacedLogger implements Logger {
		
		public void log(String message) {
				
			StringBuilder spacedMessage = new StringBuilder();
			for (int i = 0; i < message.length(); i++) {
				spacedMessage.append(message.charAt(i)).append(" ");
			
			}
			System.out.println(spacedMessage.toString());
		}

		
		public void error(String message) {
			StringBuilder spacedMessage = new StringBuilder();
			for (int i = 0; i < message.length(); i++) {
				spacedMessage.append(message.charAt(i)).append(" ");
			}
			System.out.println("ERROR: " + spacedMessage.toString());
		}

}
