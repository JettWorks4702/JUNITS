package com.raghav.junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.raghav.juints.Shapes;

public class TestTrial {

	@Test
	public void test() {
		assertEquals(6,3+3);
	}
	
	@Test
	public void testComputeSquareArea()
	{
		Shapes shape = new Shapes();
		assertNotEquals(586,shape.computeSquareArea(24));
		assertTrue(true);
	}
	
	@Test
	public void testComputeCircleArea()
	{
		Shapes shape = new Shapes();
		assertEquals(78.5,shape.computeCircleArea(5),()->"Area of circle calculation is wrong");
	}

}
