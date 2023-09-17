package com.estudo.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test Math Operations with Parameters")
public class SimpleMathTest {
	
	SimpleMath math;
	
	@BeforeAll
	static void setup() {
		
		System.out.println("Running @BeforeAll method!");
	}
	
	@AfterAll
	static void cleanup() {
		
		System.out.println("Running @AfterAll method!");
	}
	
	@BeforeEach
	 void beforeEachMethod() {
		math = new SimpleMath();
		System.out.println("Running @BeforeEach method!");
	}
	
	@AfterEach
	 void afterEachMethod() {
		System.out.println("Running @AfterEach method!");
	}
	
	 
		@DisplayName("Test Division with Parameters")
	    @ParameterizedTest
	    @MethodSource("testDivisionInputParameters")
	    void testDivision(double firstNumber,double secondNumber, double expected  ) {
	    	
	        System.out.println("Test "+ firstNumber+ " / "+ secondNumber+ " = "+expected);
	        Double actual = math.division(firstNumber, secondNumber);
	        
	        assertEquals(expected, actual, 2D,
	                () -> firstNumber + "/" + secondNumber +
	                " did not produce " + expected + "!");
	    }
	    
	    
	    
	   public static Stream<Arguments> testDivisionInputParameters(){
		   
		   return Stream.of(
				   Arguments.of(6.2D,2D,3.1D),
				   Arguments.of(71D,14D,5.07D),
				   Arguments.of(18.3D,3.1D,5.90D)
				   );
	   }

}
