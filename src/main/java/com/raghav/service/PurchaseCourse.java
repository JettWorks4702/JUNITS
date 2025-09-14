package com.raghav.service;

import com.raghav.juints.Course;

public class PurchaseCourse {

	private Course course;
	
	public boolean proceedWithCourse(Course course)
	{
		return course.coursePurchased();
	}
}
