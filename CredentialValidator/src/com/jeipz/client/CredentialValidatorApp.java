package com.jeipz.client;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.jeipz.test.CredentialValidatorTest;

public class CredentialValidatorApp {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(CredentialValidatorTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println((result.wasSuccessful()) ? "Test passed!" : "Test failed!");
		System.out.println("Failure count: " + result.getFailureCount());
		
	}
	
}
