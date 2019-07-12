package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	private static Logger log = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		
		System.out.println("\n Hello World..!! \n");
		log.info("Just like that");
		log.error("error");
		log.warn("Warning");
		log.fatal("Fatal");
		
		
		System.out.println("Completed");
		
		

	}

}
