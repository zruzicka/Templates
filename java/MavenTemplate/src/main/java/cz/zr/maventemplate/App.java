package cz.zr.maventemplate;

import org.apache.log4j.Logger;

/**
 * Initial template class.
 */
public class App {

	private final Logger logger = Logger.getLogger(getClass());

	public static void main(String[] args) {
		new App().log("Template executed.");
	}

	protected void log(String message) {
		logger.info(message);
	}

}
