package com.jeipz.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CredentialValidator {

	/*
	 * USERNAME SPECS:
	 * - 8 to 12 alphanumeric characters long
	 * - Must begin with letter
	 * - Lower case letters and numbers only
	 * - Does not contain any special characters
	 */
	private final static String USERNAME_PATTERN = "^[a-z][a-z0-9]{7,11}$";
	
	/*
	 * PASSWORD SPECS:
	 * - 8 to 20 characters long
	 * - Contains alphanumeric and special characters
	 * - Have at least 1 number
	 * - Have at least 1 upper case character
	 * - Have at least 1 lower case character
	 */
	private final static String PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])([\\.#?!@$%^&*-]*).{8,20}$";
	
	public static boolean isValidUsername(String username) {
		Pattern p = Pattern.compile(USERNAME_PATTERN);
		Matcher m = p.matcher(username);
		return (m.find()) ? true : false;
	}

	public static boolean isValidPassword(String password) {
		Pattern p = Pattern.compile(PASSWORD_PATTERN);
		Matcher m = p.matcher(password);
		return (m.find()) ? true : false;
	}
	
}
