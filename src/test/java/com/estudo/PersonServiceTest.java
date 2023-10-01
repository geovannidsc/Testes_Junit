package com.estudo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.estudo.model.Person;
import com.estudo.service.IPersonService;
import com.estudo.service.PersonService;

public class PersonServiceTest {
	
	IPersonService service;

	Person person;

	
	@BeforeEach
	void setup() {
		service = new PersonService();
		 person = new Person(
				"Keith",
				"Moon",
				"wembley - US",
				"Male",
				"Kmoon@erudio.com.br"
				);
	}
	
	
	
	
	@DisplayName("When Create a Person with Success Should Return a Person Object")
	@Test
	void testCreatePerson_whenSucess_ShouldReturnPersonObject() {
		// Given / Arrange
	
		
		// When / Act
		Person actual = service.createPerson(person);
		
		// Then / Assert
		
		assertNotNull(actual,( )-> "The createPerson() should not have returned null!");
		
	}
	
	@DisplayName("When Create a Person with Success Should Contains Valid Fields in  Returned Person Object")
	@Test
	void testCreatePerson_whenSucess_ShouldContainValidFieldsInReturnedPersonObject() {
		// Given / Arrange
		
		
		// When / Act
		Person actual = service.createPerson(person);
		
		// Then / Assert
		assertNotNull(person.getId(),()-> "Person ID id Missing");
		assertEquals(person.getFirstName(),
				actual.getFirstName(),
				( )-> "The FirstName is Incorrect! ");
		assertEquals(person.getLastName(),
				actual.getLastName(),
				( )-> "The LastName is Incorrect! ");
		assertEquals(person.getAddress(),
				actual.getAddress(),
				( )-> "The Address is Incorrect! ");
		assertEquals(person.getGender(),
				actual.getGender(),
				( )-> "The Gender is Incorrect! ");
		assertEquals(person.getEmail(),
				actual.getEmail(),
				( )-> "The Email is Incorrect! ");
		
	}
	
	
	@DisplayName("When Create a Person with Null Email Should throw IllegalArgumentException")
	@Test
	void testCreatePerson_whithNullEMail_ShouldThrowIllegalArgumentException() {
		// Given / Arrange
		person.setEmail(null);
				
		var expectedMessage = "The Person e-mail is null or empty";
		
		// When / Act
	
				
		// Then / Assert
		
	  IllegalArgumentException exception = assertThrows(
				IllegalArgumentException.class,
				()-> service.createPerson(person),
				()-> "Empty e-mail should have cause IllegalArgumentException"
	);
	
	  assertEquals(
			  expectedMessage, 
			  exception.getMessage(),
			  ()->"Exception error message is incorrect!"
			  );
	  
	}
}
