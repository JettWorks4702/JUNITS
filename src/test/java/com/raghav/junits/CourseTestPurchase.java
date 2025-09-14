package com.raghav.junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.raghav.juints.JavaCourse;
import com.raghav.juints.JunitCourse;
import com.raghav.juints.SpringCourse;
import com.raghav.service.PurchaseCourse;

class CourseTestPurchase {

	@Test
	void testProceedWithCourse() {
		
		PurchaseCourse pc = new PurchaseCourse();
		pc.proceedWithCourse(new JavaCourse());
		pc.proceedWithCourse(new JunitCourse());
		pc.proceedWithCourse(new SpringCourse());
	}

}
