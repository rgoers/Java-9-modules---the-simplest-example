package pl.tfij.java9modules.slf4japp;

import pl.tfij.java9modules.greetings.Greeting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SLF4JApp {

    private static Logger logger = LoggerFactory.getLogger(SLF4JApp.class);

    public static void main(String[] args) {
        System.out.println("Testing SLF4J");
        System.out.println("Class path: " + System.getProperty("java.class.path"));
        System.out.println("Module path:" + System.getProperty("jdk.module.path"));
        String greeting = new Greeting().regular("World");
        System.out.println(greeting);
        logger.info(greeting);
    }


}
