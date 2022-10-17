package com.example.docker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SpringBootDemoApplicationTest {

	static Logger logger = LoggerFactory.getLogger(SpringBootDemoApplicationTest.class);

	@Test
	void test() {
		logger.info("... SpringBootDemoApplicationTest Start ...");
		assertEquals(true, true);
		logger.info("... SpringBootDemoApplicationTest End ...");
	}

}
