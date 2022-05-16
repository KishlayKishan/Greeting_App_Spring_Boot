package com.example.greetingapp.service;

import org.springframework.stereotype.Service;

/**
 * Service Class: GreetingService.
 */

@Service
public class GreetingService {

	/**
	 * Method for printing String.
	 *
	 * @return - Hello !!!
	 */

	public String sayHelloByName(String firstName, String lastName) {
		return "Hello " + firstName + " " + lastName + "!!!";
	}
}