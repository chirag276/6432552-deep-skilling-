package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Application started.");

        try {
            int result = divide(10, 0);
            logger.info("Result: " + result);
        } catch (ArithmeticException e) {
            logger.error("Error occurred while dividing numbers: ", e);
        }

        logger.warn("This is a warning: Low disk space.");
        logger.info("Application finished.");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
