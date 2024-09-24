package com.codegnan.university.management;

public class Course {
	private String title; // title of the course

	public Course(String title) { // constructor to initialize the course with title
		this.title = title;
	}

	public String getTitle() { // getter method to retrieve the course title
		return title;
	}

	// override toString method to provide the String representation of the course
	public String toString() {
		return title; // return the course title as the string representation

	}
}
