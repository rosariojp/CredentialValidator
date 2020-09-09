package com.jeipz.domain;

public enum CredentialPattern {
	
	/*
	 * USERNAME SPECS:
	 * - 8 to 12 alphanumeric characters long
	 * - Must begin with letter
	 * - Lower case letters and numbers only
	 * - Does not contain any special characters
	 */
	USERNAME("^[a-z][a-z0-9]{7,11}$"),
	
	/*
	 * PASSWORD SPECS:
	 * - 8 to 20 characters long
	 * - Contains alphanumeric and special characters
	 * - Have at least 1 number
	 * - Have at least 1 upper case character
	 * - Have at least 1 lower case character
	 */
	PASSWORD("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])([\\.#?!@$%^&*-]*).{8,20}$");
	
	private String pattern;
	
	public String getPattern() {
		return pattern;
	}
	
	private CredentialPattern(String pattern) {
		this.pattern = pattern;
	}
	
}
