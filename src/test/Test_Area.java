package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pc1.Area;

class Test_Area {

	@Test
	void test_circleArea() {
		double a = Area.AreaCalculate(15.0);
		
		assertEquals(706.5, a, .5);
		
	}
	
	@Test
	void test_rectangleArea() {
		double b = Area.AreaCalculate(5,5);
		
		assertEquals(25, b);
	}
	
	@Test
	void test_cylinderArea() {
		double c = Area.AreaCalculate(5.0,5.0);
		assertEquals(392.5, c, .5);
	}

}
