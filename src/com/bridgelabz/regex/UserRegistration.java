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

	public void validLastName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last name : ");
		String lastName = sc.nextLine();

		boolean fName = Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", lastName);

		if (fName) {
			System.out.println("lastname is correct ");
		} else {
			System.out.println("lastname is incorrect ");
		}

	}

	public void validEmailId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email id");
		String email = sc.nextLine();

		boolean validEmail = Pattern.matches("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*$", email);
		if (validEmail) {
			System.out.println("Email is valid");
		} else {
			System.out.println("Email is invalid");
		}
	}

	public void validPhoneNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phone number: ");
		String phoneNumber = sc.nextLine();
		boolean number = Pattern.matches("^[9][1][ ][6-9]{1}[0-9]{9}$", phoneNumber);

		if (number) {
			System.out.println("Phone number is correct");
		} else {
			System.out.println("Phone number is incorrect");
		}
	}

	public static void main(String[] args) {
		System.out.println("welcome to user registration program");
		UserRegistration userRegistration = new UserRegistration();
		// userRegistration.validFirstName();
		// userRegistration.validLastName();
		// userRegistration.validEmailId();
		userRegistration.validPhoneNumber();
	}

}
