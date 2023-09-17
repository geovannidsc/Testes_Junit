package com.estudo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.estudo.entities.SimpleMath;

@DisplayName("Test Math Operations is SimpleMath Class")
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
		math = new SimpleMath();
		System.out.println("Running @AfterEach method!");
	}
	
	 @Test
	 @DisplayName("Test 6.2 + 2 = 8.2")
	    void testSum_When_SizDotTwoIsAddesByTwo_ShouldReturnEightDotTwo() {
		
		 System.out.println("Test 6.2 + 2 = 8.2");
		 
	        double firstNumber = 6.2D;
	        double secondNumber = 2D;
	        
	        Double actual = math.sum(firstNumber, secondNumber);
	        double expected = 8.2D;
	        
	        assertEquals(expected, actual,
	            () -> firstNumber + "+" + secondNumber +
	            " did not produce " + expected + "!");
	    }
	    
	    @Test
	    @DisplayName("Test 6.2 - 2 = 4.2")
	    void testSubtraction() {
	    	System.out.println("Test 6.2 - 2 = 4.2");
	    	
	        double firstNumber = 6.2D;
	        double secondNumber = 2D;
	        
	        Double actual = math.subtraction(firstNumber, secondNumber);
	        double expected = 4.2D;
	        
	        assertEquals(expected, actual,
	                () -> firstNumber + "-" + secondNumber +
	                " did not produce " + expected + "!");
	    }
	    
	    @Test
	    @DisplayName("Test 6.2 * 2 = 12.4")
	    void testMultiplication() {
	    	System.out.println("Test 6.2 * 2 = 12.4");
	    	
	        double firstNumber = 6.2D;
	        double secondNumber = 2D;
	        
	        Double actual = math.multiplication(firstNumber, secondNumber);
	        double expected = 12.4D;
	        
	        assertEquals(expected, actual,
	                () -> firstNumber + "*" + secondNumber +
	                " did not produce " + expected + "!");
	    }
	    
	    @Test
	    @DisplayName("Test 6.2 / 2 = 3.1")
	    void testDivision() {
	    	
	    	System.out.println("Test 6.2 / 2 = 3.1");
	    	
	        double firstNumber = 6.2D;
	        double secondNumber = 2D;
	        
	        Double actual = math.division(firstNumber, secondNumber);
	        double expected = 3.1D;
	        
	        assertEquals(expected, actual,
	                () -> firstNumber + "/" + secondNumber +
	                " did not produce " + expected + "!");
	    }
	    
	    @Test
	    @DisplayName("Teste Division by Zero")
	    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
	    	System.out.println("Teste Division by Zero");

	    	//given
	    	double firstNumber = 6.2D;
	        double secondNumber = 0D;
	        
	        //when & then
	        var expectedMessage = "Impossible to divide by zero!";
	        //when & then
	       ArithmeticException actual = assertThrows(ArithmeticException.class, () ->{
	        	math.division(firstNumber,secondNumber);	        	
	        }, ()-> "Division by zero shoul throw an ArithmeticException");
	        
	        assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected exception message");
	    }
	    
	    @Test
	    @DisplayName("Test (6.2 + 2)/2 = 4.1")
	    void testMean() {
	    	System.out.println("Test (6.2 + 2)/2 = 4.1");
	    	
	        double firstNumber = 6.2D;
	        double secondNumber = 2D;
	        
	        Double actual = math.mean(firstNumber, secondNumber);
	        double expected = 4.1D;
	        
	        assertEquals(expected, actual,
	            () -> "(" + firstNumber + "+" + secondNumber + ")/2" +
	            " did not produce " + expected + "!");
	    }

	    @Test
	    @DisplayName("Teste Square Root of 81 = 9")
	    void testSquareRoot() {
	    	
	    	System.out.println("Teste Square Root of 81 = 9");
	    	
	        double number = 81D;
	        double expected = 9D;
	        
	        Double actual = math.squareRoot(number);
	        
	        assertEquals(expected, actual,
	            () -> "Square Root of " + number +
	            " did not produce " + expected + "!");
	    }
	    
	   

}
