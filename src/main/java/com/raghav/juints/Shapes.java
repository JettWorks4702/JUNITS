package com.raghav.juints;

import java.util.Arrays;

public class Shapes {

	public double computeSquareArea(double length) {
		double res = length * length;
		return res;
	}

	public double computeCircleArea(double radius) {

		return 3.14 * radius * radius;
	}

	public boolean returnMessage() {
		System.out.println("No one is good");
		return false;
	}
	
	public int[] sortingArray(int[] array)
	{
		
			Arrays.sort(array);
		
		return array;
	}
	
	public int[] testPerformance(int[] array)
	{
		for(int i=0;i<1000000;i++)
		{
			Arrays.sort(array);
		}
		return array;
	}
	
	

}
