package com.bl.userEntrywithjunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
	
	public static void main(String[] args) {
		String lastNamePattern = "^[A-Z]{1}[a-z]{3,9}$";
		Pattern regex = Pattern.compile(lastNamePattern);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last Name :");
		
		String inputStr = sc.next();
		Matcher lastNameMatcher = regex.matcher(inputStr);
		sc.close();
		
		if(lastNameMatcher.matches()) {
			System.out.println(inputStr+" is Valid Input");
		}else {
			System.out.println(inputStr+ " is a Invalid Input");
		}
	}
}
