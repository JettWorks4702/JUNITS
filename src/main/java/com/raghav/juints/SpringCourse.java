package com.raghav.juints;


public class SpringCourse  implements Course {

	@Override
	public boolean coursePurchased()
	{
		System.out.println("Spring course purchased");
		return true;
	}
}
