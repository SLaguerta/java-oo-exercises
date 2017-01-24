import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTester {

	@Test
	public void testIsSquare() {
		Rectangle r = new Rectangle(5,5);
		assertTrue("Problem getting length, width", r.isSquare()=="This rectangle is also a square!");
		Rectangle s = new Rectangle(7,4);
		assertTrue("Problem getting length, width", s.isSquare()=="This is just a rectangle.");
	}
	
	@Test
	public void testCompareArea(){
		Rectangle r = new Rectangle(5,5);
		Rectangle s = new Rectangle(7,5);
		Rectangle t = new Rectangle(5,5);
		assertTrue("Problem with areas of rectangles", r.compareArea(s)=="First rectangle is smaller than the other!");
		assertTrue("Problem with areas of rectangles", s.compareArea(r)=="First rectangle is larger than the other!");
		assertTrue("Areas should be equal", r.compareArea(t)=="The rectangles are of equal area!");
		
	}

}
