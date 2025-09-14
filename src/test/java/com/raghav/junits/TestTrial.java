package com.raghav.junits;


import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

import com.raghav.juints.Shapes;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestTrial {

	TestTrial(){
		System.out.println("Constructor called");
	}
	Shapes shape;
	
	@BeforeAll
	static void beforeAll()
	{
		System.out.println("Before ALll");
	}
	
	@BeforeEach
	public void init()
	{
		shape = new Shapes();
		System.out.println("Before test");
	}
	@Test
	public void test() {
		assertEquals(6, 3 + 3);
	}

	@Test
	public void testComputeSquareArea() {

		assertNotEquals(586, shape.computeSquareArea(24));
		assertTrue(true);
	}

	@Test
	public void testComputeCircleArea() {

		assertEquals(78.5, shape.computeCircleArea(5), () -> "Area of circle calculation is wrong");
	}

	@Test
	public void testFalse() {

//		assertTrue(shape.returnMessage(),()->"False because unit is resulting in false");
		assertFalse(shape.returnMessage());
	}

	@Test
	public void testArrays() {
		int[] expected = { 2, 4, 6, 8 };
		int[] actual = { 4, 8, 6, 2 };
//	    assertArrayEquals(expected,actual,()->"Arrays are not same");
//		Arrays.sort(actual);
//   	assertArrayEquals(expected,actual);
		assertNotEquals(expected, actual);

	}

	@Test
	public void testSorting_Excpetion()
	{
		try {


			int unsorted[] = null;
			assertThrows(NullPointerException.class,()->shape.sortingArray(unsorted));
			int sortedArray[] = shape.sortingArray(unsorted);
			for(int elem:sortedArray)
			{
				System.out.println(elem);
			}
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	
	}
	
	@Test
	public void testPerformance()
	{


		int unsorted[] = {2,5,4,0,0,0};
        assertTimeout(Duration.ofMillis(1),()->shape.sortingArray(unsorted));
	}
	
	@AfterEach
	public void destroy()
	{
		System.out.println("Test case completed");
	}
	
	@AfterAll
	static void afterAll()
	{
		System.out.println("Test cases are tested");
	}
	

}
