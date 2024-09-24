package com.codegnan.university.management;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	private String name;
	private List<Course> assignedCourses; // list to hold courses assigned to the professor

	public Professor(String name) { // constructor to initialize professor with name and empty list of assigned
		this.name = name;
		this.assignedCourses = new ArrayList();
	}

	public String getName() { // Getter method to retrieve the professor name
		return name;
	}

	// method to assign a course to the professor
	public void assignCourse(Course course) {
		// check if the course is not already in the list of assigned courses
		if (!assignedCourses.contains(course)) {
			assignedCourses.add(course); // add course to the list of not already present
		}
	}

	// getter method to retrieve the list of courses assigned to the professor
	public List<Course> getAssignedCourses() {
		return assignedCourses; // return the list of assigned courses
	}

	// override two string method to provide a string representation of the
	// professor
	public String toString() {
		return name; // return professor name as the string representation
	}
}
