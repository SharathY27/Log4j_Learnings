package log4jPractice;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyFileConfiguratorExample {

	static Logger logger = Logger.getLogger(PropertyFileConfiguratorExample.class);
	
	public static void main(String[] args) {
		
		
//		In this we will do custom configurations using properties file
//		Previously we have done basic configurations which will do default conversion pattern
//		We need to write our custom configurations in properties file and use for this class
//		In log4j.properties file we also used ConsoleAppender so that it will print log in console also 
		
		
		PropertyConfigurator.configure("../Log4JLearnings\\PropterfyConfiguratorFiles\\log4j.properties");
		
		logger.debug("This is a debug message");
		logger.info("This is an info");
		logger.warn("This is a warning");
		logger.error("This is an error");
		logger.fatal("This is a fatal message");
		

	}

}
