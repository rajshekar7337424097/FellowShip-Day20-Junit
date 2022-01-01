package com.bl.junit.tesing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserEntryTesting {
	
	@Test
	public void userTest() {
		ValidateUserEntry userEntry = new ValidateUserEntry();
		assertEquals("Rajshekar", userEntry.firstName("Rajshekar"));
		assertEquals("Reddy", userEntry.lastName("Reddy"));
		assertEquals("9999977777 ", userEntry.contactNumber("9999977777"));
		assertEquals("raj@gmail.com" ,userEntry.emailID("raj@gmail.com"));
	}

}
