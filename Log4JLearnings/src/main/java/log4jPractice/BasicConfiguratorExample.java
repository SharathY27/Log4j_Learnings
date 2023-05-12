package log4jPractice;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class BasicConfiguratorExample {

	
	//This is factory design pattern which is creating object without new keyword
	static Logger Logger =org.apache.log4j.Logger.getLogger(BasicConfiguratorExample.class); 
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure(); //by default it follows " %-4r [%t] %-5p %c %x -%m%n " pattern
		Logger.debug("This is a debug message");
		Logger.info("This is an info");
		Logger.warn("This is a warning");
		Logger.error("This is an error");
		Logger.fatal("This is a fatal message");
	}
	
	
}
