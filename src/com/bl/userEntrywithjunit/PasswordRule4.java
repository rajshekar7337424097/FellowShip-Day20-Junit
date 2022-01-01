package com.bl.userEntrywithjunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRule4 {
	public static boolean passwordRule4(String inputStr) {
		String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])[@$!%*#?&][A-Za-z0-9@$!%*#?&]{8,}$";
		Pattern regex = Pattern.compile(passwordPattern);
		Matcher passwordMatcher4 = regex.matcher(inputStr);
		
		if(passwordMatcher4.matches()) {
			System.out.println(inputStr+" Rule 2 is passed and succesfully loggedin.");
			return true;
		}else {
			System.out.println(inputStr+" is a Invalid input ");
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Password must be 8 character and having atleast one numerics and special charecter");
		System.out.println("Enter Password :");
		String inputStr = sc.next();
		sc.close();
		
		passwordRule4(inputStr);	
	}

}
