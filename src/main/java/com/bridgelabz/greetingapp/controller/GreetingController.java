package com.bridgelabz.greetingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.greetingapp.entity.User;
import com.example.greetingapp.service.GreetingService;

/**
 * Rest Controller Class: GreetingController.
 */
@RestController
public class GreetingController {
	/**
	 * GreetingService object: greetingService.
	 */
	@Autowired
	GreetingService greetingService;

	/**
	 * Method for Get request using dependency injection: sayHello. URL: /hello
	 *
	 * @return - greetingService.sayHello
	 */

	@GetMapping("/hello")
	public String sayPosting(@RequestParam(required = false) String firstName,
			@RequestParam(required = false) String lastName) {
		if (lastName == null)
			lastName = "";
		else if (firstName == null)
			firstName = "";
		else if (firstName == null && lastName == null) {
			firstName = "";
			lastName = "";
		}
		return greetingService.sayHelloByName(firstName, lastName);
	}

	@PostMapping("/post")
	public User sayHello(@RequestBody User user) {
		User newuser = greetingService.sayHello(user);
		return newuser;
	}
}