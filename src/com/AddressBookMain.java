package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class AddressBookMain {
	
	
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Address book ");
		InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
		
		System.out.println("Enter new entry :");
		System.out.println("Enter first name:- ");
		String fname = in.readLine();
		
		System.out.println("Enter last name:- ");
		String lname = in.readLine();
		
		System.out.println("Address :-");
		
		
		String address = in.readLine();
		
		System.out.println("State :-");
		String state = in.readLine();
		
		System.out.println("Zip code:- ");
		String zip = in.readLine();
		
		System.out.println("Phone number:- ");
		String phone = in.readLine();
		
		System.out.println("Name: "+fname+ " " +lname);

		System.out.println("Address : "+address);
		System.out.println("State : "+state);
		System.out.println("Zip code : "+zip);
		System.out.println("Phone number : "+phone);
		
		
	}

}
