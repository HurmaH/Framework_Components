package beta;

import org.apache.logging.log4j.*;

public class Demo2 {
	private static Logger log = LogManager.getLogger(Demo2.class.getName());// giving class path

	public static void main(String[] args) {
		// print output
		log.debug("I am debugging");

		log.info("object is present");

		log.error("object is not present");

		log.fatal("This is fatal");
	}

}
