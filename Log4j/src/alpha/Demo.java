package alpha;

import org.apache.logging.log4j.*;

public class Demo {
	private static Logger log = LogManager.getLogger(Demo.class.getName());// giving class path

	public static void main(String[] args) {
		// print output
		log.debug("I have clicked the button");

		log.info("Button is displayed");

		log.error("Button is not displayed");

		log.fatal("Button is missing");
	}

}
