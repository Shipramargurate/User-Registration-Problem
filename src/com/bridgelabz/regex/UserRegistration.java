package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public boolean validFirstName(String name) {
		// firstName or lastName starts with Cap and has minimum 3 characters

		Pattern fName = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
		boolean isValid = fName.matcher(name).matches();

		if (isValid) {
			System.out.println(name + " is Valid ");
		} else {
			System.out.println(name + " is Invalid ");
		}
		return isValid;
	}

	public boolean validLastName(String name) {
		// Validation for firstName or lastName is same
		boolean isValid = validFirstName(name);

		return isValid;
	}

	public boolean validEmailId(String email) {
		/*
		 * E.g. abc.xyz@bl.co.in Email has 3 mandatory parts (abc, bl & co) and 2
		 * optional (xyz & in) with precise @ and . positions
		 */

		Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*$");
		boolean isValid = pattern.matcher(email).matches();
		if (isValid) {
			System.out.println("Email is valid " + email);
		} else {
			System.out.println("Email is invalid " + email);
		}
		return isValid;
	}

	public boolean validPhoneNumber(String number) {
		Pattern pattern = Pattern.compile("^[9][1][ ][6-9][0-9]{9}$");
		boolean isValid = pattern.matcher(number).matches();

		if (isValid) {
			System.out.println(" number is valid " + number);
		} else {
			System.out.println("number is inValid " + number);
		}
		return isValid;
	}

	public boolean validPassword(String password) {
		// password all rules 1 to 4
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=])?.{8,}$");
		boolean isValid = pattern.matcher(password).matches();
		if (isValid) {
			System.out.println("password is valid " + password);
		} else {
			System.out.println("password is invalid " + password);
		}
		return isValid;
	}
}