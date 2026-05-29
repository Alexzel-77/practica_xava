package ni.edu.ni.practicaxava.run;

import org.openxava.util.*;

/**
 * Execute this class to start the application.
 */

public class practicaxava {

	public static void main(String[] args) throws Exception {
		DBServer.start("practicaxava-db"); // To use your own database comment this line and configure src/main/webapp/META-INF/context.xml
		AppServer.run("practicaxava"); // Use AppServer.run("") to run in root context
	}

}
