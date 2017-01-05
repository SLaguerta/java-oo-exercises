import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTester {
	


	@Test
	public void testMovewithNewSpeed() {
		Robot r = new Robot("Sandra", 0, 0, 5, "north");
		assertTrue("Problem setting the speed", r.getSpeed() == 5);
		r.move(12);
		assertTrue("Problem moving robot when adding more speed", r.getYPosition()==12);
	}
	
	@Test
	public void testMoveWithNoNewSpeed() {
		Robot r = new Robot("Sandra", 0, 0, 5, "north");
		assertTrue("Problem setting the speed", r.getSpeed() == 5);
		r.move();
		assertTrue("Problem moving robot with no added speed", r.getYPosition()==5);
	}
	
	@Test
	public void testRotate() {
		Robot r = new Robot("Sandra", 0, 0, 5, "south");
		assertTrue("Problem setting orientation", r.getOrientation() == "south");
		r.rotate("east");
		assertTrue("Problem rotating robot", r.getOrientation()== "east");
	}

	@Test
	public void testDistance() {
		Robot s = new Robot("Sandra", 0, 6, 0, "east");
		Robot d = new Robot("Dianne", 8, 0, 0, "east");
		//s.distance(d);
		assertTrue("Problem finding the distance between two robots", s.distance(d) == 10);
	}
}
