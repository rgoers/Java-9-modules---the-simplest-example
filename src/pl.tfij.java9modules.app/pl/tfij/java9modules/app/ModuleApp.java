package pl.tfij.java9modules.app;

import pl.tfij.java9modules.greetings.Greeting;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class ModuleApp {

    private static Logger logger = LogManager.getLogger(ModuleApp.class)
;
    public static void main(String[] args) {
        System.out.println("Testing Log4j");
        System.out.println("Class path: " + System.getProperty("java.class.path"));
        System.out.println("Module path:" + System.getProperty("jdk.module.path"));
        String greeting = new Greeting().regular("World");
        System.out.println(greeting);
        logger.info(greeting);
    }


}
