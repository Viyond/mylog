package com.yzb.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest
{
    private static Logger LOGGER = LoggerFactory.getLogger(LogTest.class);
    
    public static void main(String[] args)
    {
        // 下面5个方法相当于接口调用实现
        LOGGER.info("......info");
        LOGGER.debug("......debug");
        LOGGER.warn("......warn");
        LOGGER.error("......error");
        LOGGER.trace("......trace");
    }

    public static void printLog()
    {
    	// 下面5个方法相当于接口调用实现
        LOGGER.info("......info");
        LOGGER.debug("......debug");
        LOGGER.warn("......warn");
        LOGGER.error("......error");
        LOGGER.trace("......trace");
    }
}
