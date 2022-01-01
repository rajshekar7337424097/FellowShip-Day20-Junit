package com.bl.userEntrywithjunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {

	public static void main(String[] args) {
		String firstNamePattern = "^[A-Z]{1}[a-z]{2,9}$";
		Pattern regex =Pattern.compile(firstNamePattern);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name :");
		String inputStr = sc.next();

		Matcher firstNameMatcher = regex.matcher(inputStr);
		sc.close();

		if(firstNameMatcher.matches()) {
			System.out.println(inputStr+" is a Valid Input");
		}else {
			System.out.println(inputStr+" is a Invalid Input");
		}
	}
}
