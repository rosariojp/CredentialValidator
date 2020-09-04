package com.jeipz.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jeipz.domain.CredentialValidator;

public class CredentialValidatorTest {

	@Test
	public void checkValidUsernames() {
		String[] validUsernames = { "juandelacruz", "juancruz1234", "lovejava" };
		for (String validUsername : validUsernames) {
			assertTrue(CredentialValidator.isValidUsername(validUsername));
		}
	}

	@Test
	public void checkInvalidUsernames() {
		String[] invalidUsernames = { "short", "toolongusername", "Uppercase", "juan!*@cruz", "1234juancruz" };
		for (String invalidUsername : invalidUsernames) {
			assertFalse(CredentialValidator.isValidUsername(invalidUsername));
		}
	}

}
