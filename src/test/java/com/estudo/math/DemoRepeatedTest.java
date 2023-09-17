package com.estudo.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.springframework.test.annotation.Repeat;

class DemoRepeatedTest {

SimpleMath math;
	
	
	@BeforeEach
	 void beforeEachMethod() {
		math = new SimpleMath();
		System.out.println("Running @BeforeEach method!");
	}
	

	
	@RepeatedTest(4)
    @DisplayName("Teste Division by Zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException(
    		RepetitionInfo repetitionInfo, TestInfo testInfo
    		) {
    	System.out.println("Repetition N° "+ repetitionInfo.getCurrentRepetition()
    	+ " of " + repetitionInfo.getTotalRepetitions()
    	);
    	
    	System.out.println("Running "+ testInfo.getTestMethod().get().getName());

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
	

}
