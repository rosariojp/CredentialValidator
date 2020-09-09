package com.jeipz.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CredentialValidator {

	private static boolean regexMatch(CredentialPattern credential, String value) {
		Pattern p = Pattern.compile(credential.getPattern());
		Matcher m = p.matcher(value);
		return (m.find()) ? true : false;
	}
	
	public static boolean isValidUsername(String username) {
		return regexMatch(CredentialPattern.USERNAME, username);
	}

	public static boolean isValidPassword(String password) {
		return regexMatch(CredentialPattern.PASSWORD, password);
	}
	
}
