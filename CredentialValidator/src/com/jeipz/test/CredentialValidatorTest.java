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
	
	@Test
	public void checkValidPasswords() {
		String[] validPasswords = { "JuanDe1@cruz", "P@ssw0rd_1234", "Abcde12345" };
		for (String validPassword : validPasswords ) {
			assertTrue(CredentialValidator.isValidPassword(validPassword));
		}
	}
	
	@Test
	public void checkInvalidPasswords() {
		String[] invalidPasswords = { "abcdefgh", "ABCDEFGH", "Sh0rt!", "To0L0ngP4s$worddDdd!adswazxd()", "doesn0thaveupp3r", "H4VEUPP3RBUTNOL0WER" };
		for (String invalidPassword : invalidPasswords ) {
			assertFalse(CredentialValidator.isValidPassword(invalidPassword));
		}
	}

}
