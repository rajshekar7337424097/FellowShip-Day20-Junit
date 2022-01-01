
package com.bl.firstname;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserEntry {
	
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
		String contactNumberPattern = "^(\\+[0-9]{2}\\s{1})?[0-9]{10}$";
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
		String emailPattern = "^abc(.+)[A-Za-z0-9]{3}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$";
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
