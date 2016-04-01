import static org.junit.Assert.*;

import org.junit.Test;


public class Tritest {

	@Test
	public void test() {
		assertEquals("Illegal",triangle1.getType(triangle1));
		assertEquals("Illegal",triangle1.getType(triangle2));
		assertEquals("Illegal",triangle1.getType(triangle3));
		assertEquals("Scalene",triangle1.getType(triangle4));
		assertEquals("Illegal",triangle1.getType(triangle5));
		assertEquals("Isosceles",triangle1.getType(triangle6));
		assertEquals("Regular",triangle1.getType(triangle7));
		assertEquals(num[0],triangle7.getBorders()[0]);
	}
    Triangle triangle1 = new Triangle(-1,0,0);
    Triangle triangle2 = new Triangle(0,-1,0);
    Triangle triangle3 = new Triangle(0,0,-1);
    Triangle triangle4 = new Triangle(2,3,4);
    Triangle triangle5 = new Triangle(1,2,3);
    Triangle triangle6 = new Triangle(5,5,4);
    Triangle triangle7 = new Triangle(3,3,3);
    long num[] = new long[]{3,3,3};
}
