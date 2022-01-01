package com.bl.junit.tesing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bl.parameterizedtesing.UserEntry;

public class ValidateUserEntry {
	public boolean firstName(String inputStr1) {
		String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
		Pattern regex = Pattern.compile(namePattern);
		Matcher firstNameMatcher = regex.matcher(inputStr1);
		
		
		if(firstNameMatcher.matches()) {
			System.out.println(inputStr1+" is valid Name");
			return true;
		}else {
			System.out.println(inputStr1+ " is invalid Name");
			return false;
		}

	}
	
	public boolean lastName(String inputStr2) {
		String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
		Pattern regex = Pattern.compile(namePattern);
		Matcher lastNameMatcher = regex.matcher(inputStr2);
		
		
		if(lastNameMatcher.matches()) {
			System.out.println(inputStr2+" is valid Name");
			return true;
		}else {
			System.out.println(inputStr2+ " is invalid Name");
			return false;
		}
	}
	
	public boolean contactNumber(String inputStr3) {
		String contactNumberPattern = "[+]{0,1}[0-9]{0,2}[0-9]{10}$";
		Pattern regex = Pattern.compile(contactNumberPattern);
		Matcher contactNumberMatcher = regex.matcher(inputStr3);
		
		if(contactNumberMatcher.matches()) {
			System.out.println(inputStr3+" is valid Contact number.");
			return true;
		}else {
			System.out.println(inputStr3+" is invalid Contact Number");
			return false;
		}
	}
	
	public boolean emailID(String inputStr4) {
		String emailPattern = "^[a-z.]{2,30}@{1}[a-z]{3,10}.[a-z]{3}$";
		Pattern regex = Pattern.compile(emailPattern);
		Matcher emailMatcher = regex.matcher(inputStr4);
		
		if(emailMatcher.matches()) {
			System.out.println(inputStr4+ "is valid Email");
			return true;
			
		}else {
			System.out.println(inputStr4+"is invalid email address");
			return false;
		}
	}
	
	public static void main(String[] args) {
		UserEntry details = new UserEntry();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String inputStr1 = sc.next();
		System.out.println("Enter Last Name: ");
		String inputStr2 = sc.next();
		System.out.println("Enter Contact Number");
		String inputStr3 = sc.next();
		System.out.println("Enter EmailID");
		String inputStr4 = sc.next();
		sc.close();
		
		System.out.println(" USER Entry ");
		details.firstName(inputStr1);
		details.lastName(inputStr2);
		details.contactNumber(inputStr3);
		details.emailID(inputStr4);
	}
}
