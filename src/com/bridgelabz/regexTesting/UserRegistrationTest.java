package com.bridgelabz.regexTesting;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.bridgelabz.regex.UserRegistration;

import junit.framework.Assert;

public class UserRegistrationTest {
	 static UserRegistration userRegistration;

	    @BeforeClass
	    public static void initialize(){
	        userRegistration = new UserRegistration();
	    }

	    @Test
	    public void givenFirstName_WhenValid_ShouldReturnsTrue(){
//	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.validFirstName("Shivani");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenFirstNameWhenInValidShouldReturnFalse(){
//	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.validFirstName("shivani");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenLastNameWhenValidShouldReturnTrue(){
//	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.validLastName("Kumari");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenLastNameWhenInValidShouldReturnFalse(){
	        boolean result = userRegistration.validLastName("kumari");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenEmailWhenValidShouldReturnTrue(){
	        boolean result = userRegistration.validEmailId("shivani@mail.com");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenEmailWhenInValidShouldReturnFalse(){
	        boolean result = userRegistration.validEmailId("Shivani.mail.com.com");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenPhoneNumWhenValidShouldReturnTrue(){
	        boolean result = userRegistration.validPhoneNumber("91 9922558888");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenPhoneNumWhenInValidShouldReturnFalse(){
	        boolean result = userRegistration.validPhoneNumber("9234398488");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenPasswordWhenValidShouldReturnTrue(){
	        boolean result = userRegistration.validPassword("Shivani@gmail7.com");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenPasswordWhenInValidShouldReturnFalse(){
	        boolean result = userRegistration.validPassword("shivanigmailcom");
	        Assert.assertFalse(result);
	    }


	    @ParameterizedTest
	    @ValueSource(strings = {"Abc@yahoo.com","abc@gmail.com.com",})
	    public void givenEmailWhenValidShouldReturnTrue(String email) {
	        Assert.assertTrue(userRegistration.validEmailId(email));
	    }

	   @ParameterizedTest
	    @ValueSource(strings = {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc@%*.com",})
	    public void givenEmailWhenInValidShouldReturnFalse(String email) {
	        Assert.assertFalse(userRegistration.validEmailId(email));
	    }


	}
