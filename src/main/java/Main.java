package main.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Main.class);
        logger.trace("Trace");
        logger.debug("Debug");
        logger.info("Info");
        logger.error("Error");
    }
}
