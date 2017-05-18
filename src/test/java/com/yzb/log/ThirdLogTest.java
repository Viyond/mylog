package com.yzb.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThirdLogTest
{
	private static Logger LOGGER = LoggerFactory.getLogger(ThirdLogTest.class);
	
	public static void main(String[] args)
	{
		// 下面5个方法相当于接口调用实现
        LOGGER.info("Other...info");
        LOGGER.debug("Other...debug");
        LOGGER.warn("Other...warn");
        LOGGER.error("Other...error");
        LOGGER.trace("Other...trace");

        LogTest.printLog();
	}

}
