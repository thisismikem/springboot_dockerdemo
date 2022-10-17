package com.example.docker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SpringBootDemoApplicationTest {

	static Logger logger = LoggerFactory.getLogger(SpringBootDemoApplicationTest.class);

	@Test
	void test() {
		logger.info("... SpringBootDemoApplicationTest Start ...");
		assertEquals(true, true);
		logger.info("... SpringBootDemoApplicationTest End ...");
	}

}
