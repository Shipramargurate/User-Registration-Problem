package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public void validFirstName() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name : ");
		String firstName = sc.nextLine();

		boolean fName = Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName);

		if (fName) {
			System.out.println("firstname is correct ");
		} else {
			System.out.println("firstname is incorrect ");
		}
	}

	public static void main(String[] args) {
		System.out.println("welcome to user registration program");
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.validFirstName();
	}

}
