
public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		System.out.println("***Error:" + error + "***");
		
		
	}

	

	}


