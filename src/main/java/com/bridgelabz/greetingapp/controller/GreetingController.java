package com.bridgelabz.greetingapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.greetingapp.entity.User;
import com.bridgelabz.greetingapp.service.GreetingService;

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
		else {
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

	@GetMapping("/user/{id}")
	public Optional<User> sayHelloById(@PathVariable int id) {
		Optional<User> response = greetingService.sayHelloById(id);
		return response;
	}

	@GetMapping("/users")
	public List<User> sayHelloToAll() {
		List<User> response = greetingService.sayHelloAll();
		return response;
	}
}