package com.log4j.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseLogTester {

    private final Logger logger;

    // TODO: 通过构造器，提供logger的自定义注入的功能
    // 在使用时，可以使用不同的logger进行测试
    public BaseLogTester() {
        this(LogManager.getLogger(BaseLogTester.class.getName()));
    }

    public BaseLogTester(Logger logger) {
        this.logger = logger;
        logger.debug("My log debug message");
        logger.info("My log info message");
        logger.warn("My log warn message");
        logger.error("My log error message");
    }
}
