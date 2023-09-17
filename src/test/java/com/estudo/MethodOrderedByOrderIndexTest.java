package com.estudo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MethodOrderedByOrderIndexTest {

StringBuilder actualValue = new StringBuilder("");
	
	@AfterEach
	void afterEach() {
		System.out.println("The actual value is: "+ actualValue);
	}
	
	@Test
	@Order(1)
	void testA() {
		System.out.println("Running Test A");
		actualValue.append("1");
	}
	
	@Test
	@Order(3)
	void testB() {
		System.out.println("Running Test B");
		actualValue.append("2");
	}
	
	@Test
	@Order(2)
	void testC() {
		System.out.println("Running Test C");
		actualValue.append("3");
	}
	
	@Test
	@Order(4)
	void testD() {
		System.out.println("Running Test D");
		actualValue.append("4");
	}

}
