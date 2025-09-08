package com.example.demo.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {
	
	public static final Logger log = LoggerFactory.getLogger(LoggerTest.class);
	public static void main(String[] args) {
		
		log.info("abc");
		log.error("error message");
		log.debug("debug msgs");
		
	}

}
