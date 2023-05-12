package log4jPractice;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLConfiguratorExample {

	static Logger logger = Logger.getLogger(XMLConfiguratorExample.class);
	
	public static void main(String[] args) {

		DOMConfigurator.configure("../\\Log4JLearnings\\XMLConfiguratorFiles\\log4j.xml");
		
		logger.debug("This is a debug message");
		logger.info("This is an info");
		logger.warn("This is a warning");
		logger.error("This is an error");
		logger.fatal("This is a fatal message");

	}

}
