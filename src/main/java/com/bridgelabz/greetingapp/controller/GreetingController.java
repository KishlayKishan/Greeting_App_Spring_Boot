package com.bridgelabz.greetingapp.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.greetings.model.Greeting;

@RestController
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	/**
	 * URL:localhost:8080/greeting
	 * 
	 * @return: {id =1 , content="hello world!}
	 *          localhost:8080/greeting?name=Kishlay_Kishan
	 * @return: { id=2, content="hello Kishlay_Kishan!
	 */
	@GetMapping(value = { "/greeting", "/greeting/", "/greeting/home" })
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	/**
	 * localhost:8080/greeting/Kishlay_Kishan
	 * 
	 * @return: {id =1 , content="hello Kishlay_Kishan!}
	 */
	@GetMapping("greeting/{name}")
	public Greeting greetings(@PathVariable String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}