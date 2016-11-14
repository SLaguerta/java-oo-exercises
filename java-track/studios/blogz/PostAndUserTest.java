package blogz;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class PostAndUserTest {
	// instance properties go here
User a;
User b;
	
private static boolean initialized = false;
	
	@Before
	public void init(){
		//initializer code; runs once per @Test method
		if (!initialized){
			//code that should only run once goes here
			a = new User("Sandra", "weakpass");
			b = new User("Morgan", "weak");
			initialized = true;
		}
	}
	@Test
	public void testIsValidUsername(){
		try{
			assertTrue(User.isValidUsername("Sandra"));
		}
		catch(IllegalArgumentException e){
			System.out.println("Username not valid");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsValidPassword() {
		assertTrue(a.isValidPassword("weakpass"));
		assertFalse(a.isValidPassword("no"));
		}
}
