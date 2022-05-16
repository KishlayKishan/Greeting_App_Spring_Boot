package com.example.greetingapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int id;
	String firstName;
	String lastName;

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User() {
	}

	public User(User user) {
		this.firstName = user.firstName;
		this.lastName = user.lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
	}

	public int getId() {
		return Math.toIntExact(id);
	}

	public void setId(int id) {
		this.id = id;
	}
}