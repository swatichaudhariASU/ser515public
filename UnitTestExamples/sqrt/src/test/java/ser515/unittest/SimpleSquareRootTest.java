package ser515.unittest;

// static imports are just a scoping mechanism for static members of an imported class
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

class SimpleSquareRootTest {
	
    @Test
    void testMakeSqrt() {
	assertEquals(0.0, SimpleSquareRootFunction.makeSqrt(1));
    }

    @Test
    void testzeroMakeSqrt() {
	assertEquals(0.0, SimpleSquareRootFunction.makeSqrt(0));
    }

    @Test
    void testzerosquareMe() {
	assertEquals(0, SimpleSquareRootFunction.squareMe(0));
    
}

    //@Disabled("Don't want to run this just yet")
    //@Test
    //void testDisabled() {
    //}
}
