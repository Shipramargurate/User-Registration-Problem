package com.bridgelabz.regexTesting;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import com.bridgelabz.regex.UserRegistration;
import com.bridgelabz.regex.UserRegistrationException;
import junit.framework.Assert;

public class UserRegistrationTest {
	static UserRegistration userRegistration;

	@BeforeAll
	public static void initialize() {
		userRegistration = new UserRegistration();
	}

	@Test
	public void givenFirstName_WhenValid_ShouldReturnsTrue() throws UserRegistrationException {
//        UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validFirstName("Shivani");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenFirstNameWhenInValidShouldThrowUserRegistrationException() {
//        UserRegistration userRegistration = new UserRegistration();
		Assertions.assertThrows(UserRegistrationException.class, () -> userRegistration.validFirstName("shivani"));
	}

	@Test
	public void givenLastNameWhenValidShouldReturnTrue() throws UserRegistrationException {
//        UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validLastName("Kumari");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenLastNameWhenInValidShouldThrowUSerRegistrationException() throws UserRegistrationException {
		Assertions.assertThrows(UserRegistrationException.class, () -> userRegistration.validLastName("kumari"));

	}

	@Test
	public void givenEmailWhenValidShouldReturnTrue() throws UserRegistrationException {
		boolean result = userRegistration.validEmailId("shivani@mail.com");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenEmailWhenInValidShouldThrowUserRegistration() throws UserRegistrationException {
		Assertions.assertThrows(UserRegistrationException.class,
				() -> userRegistration.validEmailId("Shivani.mail.com.com"));

	}

	@Test
	public void givenPhoneNumWhenValidShouldReturnTrue() throws UserRegistrationException {
		boolean result = userRegistration.validPhoneNumber("91 9922558888");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPhoneNumWhenInValidShouldThrowUserRegistrationException() throws UserRegistrationException {
		Assertions.assertThrows(UserRegistrationException.class, () -> userRegistration.validPhoneNumber("9234398488"));

	}

	@Test
	public void givenPasswordWhenValidShouldReturnTrue() throws UserRegistrationException {
		boolean result = userRegistration.validPassword("Shivani@gmail7.com");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPasswordWhenInValidShouldThrowsUserRegistrationException() throws UserRegistrationException {
		Assertions.assertThrows(UserRegistrationException.class,
				() -> userRegistration.validPassword("shivanigmailcom"));

	}

	@ParameterizedTest
	@ValueSource(strings = { "Abc@yahoo.com", "abc@gmail.com.com", })
	public void givenEmailWhenValidShouldReturnTrue(String email) throws UserRegistrationException {
		Assertions.assertTrue(userRegistration.validEmailId(email));
	}

	@ParameterizedTest
	@ValueSource(strings = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc@%*.com", })
	public void givenEmailWhenInValidShouldThrowUserRegistrationException(String email) {
		Assertions.assertThrows(UserRegistrationException.class, () -> userRegistration.validEmailId(email));
	}

}
