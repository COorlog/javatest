
public class App {

	public static void main(String[] args) {
		
		Logger AsteriskLogger = new AsteriskLogger();
				
		AsteriskLogger.log("Never give up!");
		AsteriskLogger.error("You can do it!");
		
		
		Logger SpacedLogger = new SpacedLogger();
		
		SpacedLogger.log("B e H a p p y");
		SpacedLogger.error("D o n ' t  R u s h  T h i n g s");
		
		

	}

}
