package com.jeipz.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CredentialValidator {

	/*
	 * USERNAME SPECS:
	 * 8 to 12 alphanumeric characters long
	 * Must begin with letter
	 * Lower case letters and numbers only
	 * Does not contain any special characters
	 */
	private final static String USERNAME_PATTERN = "^[a-z][a-z0-9]{7,11}$";
	
	public static boolean isValidUsername(String username) {
		Pattern p = Pattern.compile(USERNAME_PATTERN);
		Matcher m = p.matcher(username);
		return (m.find()) ? true : false;
	}
	
}
