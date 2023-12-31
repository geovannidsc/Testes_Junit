package com.estudo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MethodOrderedRandonlyTest {

	
	
	@Test
	@Order(1)
	void testA() {
		System.out.println("Running Test A");
	}
	
	@Test
	@Order(3)
	void testB() {
		System.out.println("Running Test B");
	}
	
	@Test
	@Order(2)
	void testC() {
		System.out.println("Running Test C");
	}
	
	@Test
	@Order(4)
	void testD() {
		System.out.println("Running Test D");
	}

}
