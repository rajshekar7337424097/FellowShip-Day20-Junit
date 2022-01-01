package com.bl.firstname;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserEntryParameterisedTest {
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String emailID;

	
	private boolean expectedResultFName;
	private boolean expectedResultLName;
	private boolean expectedResultContactNumber;
	private boolean expectedResultEmailID;

	
	private UserEntry userEntry ;
	
	public UserEntryParameterisedTest(String firstName, String lastName, String contactNumber, String emailID, boolean expectedResultFName, 
			boolean expectedResultLName, boolean expectedResultContactNumber, boolean expectedResultEmailID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.emailID = emailID;
		this.expectedResultFName = expectedResultLName;
	}
	
	@Before
	public void initialize() {
		userEntry = new UserEntry();
	}
	
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { "", "", "", "", false, false, false, false },
				{ "Rajshekar", "reddy", "9999888877", "raj@gmail.com", false, false, false, false } });
	}

	
	@Test
	public void validateFirstName() {
		assertEquals(expectedResultFName, userEntry.firstName(firstName));
	}
	
	@Test
	public void validateLastName() {
		assertEquals(expectedResultLName, userEntry.lastName(lastName));
	}
	
	@Test
	public void validateContactnumber() {
		assertEquals(expectedResultContactNumber, userEntry.contactNumber(contactNumber));
	}
	
	@Test
	public void validateEmailID() {
		assertEquals(expectedResultEmailID, userEntry.emailID(emailID));
	}
}
