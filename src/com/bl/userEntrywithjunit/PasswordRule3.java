package com.bl.userEntrywithjunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRule3 {
	
	public static boolean passwordRule3(String inputStr) {
		String passwordPattern = "^[A-Za-z]{8}[0-9]{1}$";
		Pattern regex = Pattern.compile(passwordPattern);
		Matcher passwordMatcher3 = regex.matcher(inputStr);
		
		if(passwordMatcher3.matches()) {
			System.out.println(inputStr+" Rule 2 is passed and succesfully loggedin.");
			return true;
		}else {
			System.out.println(inputStr+" is a Invalid input ");
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Password must be 8 characher and having atleast one numerics");
		System.out.println("Enter Password :");
		String inputStr = sc.next();
		sc.close();
		
		passwordRule3(inputStr);	
	}
}
