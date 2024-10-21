package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import com.uefa.UefaApplication;

@SpringBootTest(classes = UefaApplication.class)
@ComponentScan(basePackages = "com.uefa")
class UefaApplicationTests {

	@Test
	void contextLoads() {
	}

}
