package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class HashCodeTester {
	/*
	* P5: If two objects are equal according to the equals(Object)
	* method, then calling the hashCode method on each of
	* the two objects must produce the same integer result.
	*/
	// your test methods go he
	//MUST HAVE 9 TESTS
	
	
	@Test public void propert5_CC() {
		C temp = new C(0);
		C temp2 = temp;
		assertTrue(temp.hashCode() == temp2.hashCode());
	}
	
	@Test public void propert5_CD() {
		C temp = new C(0);
		D temp2 = new D(0,0);
		assertFalse(temp.hashCode() == temp2.hashCode());
	}
	
	@Test public void propert5_CObj() {
		C temp = new C(0);
		Object temp2 = new Object();
		assertFalse(temp.hashCode() == temp2.hashCode());
	}
	
////////////////////////////////////////////////////
	@Test public void propert5_DC() {
		D temp = new D(0,0);
		C temp2 = new C(0);
		assertFalse(temp.hashCode() == temp2.hashCode());
	}
	
	@Test public void propert5_DD() {
		D temp = new D(0,0);
		D temp2 = temp;
		assertTrue(temp.hashCode() == temp2.hashCode());
	}
	
	@Test public void propert5_DObj() {
		D temp = new D(0,0);
		Object temp2 = new Object();
		assertFalse(temp.hashCode() == temp2.hashCode());
	}
	
//////////////////////////////////////////////////////
	@Test public void propert5_ObjC() {
		Object temp = new Object();
		Object temp2 = new Object();
		assertTrue(temp.hashCode() == temp2.hashCode());
	}
	
	@Test public void propert5_ObjD() {
		Object temp = new Object();
		D temp2 = new D(0,0);
		assertFalse(temp.hashCode() == temp2.hashCode());
	}
	
	@Test public void propert5_ObjObj() {
		Object temp = new Object();
		C temp2 = new C(0);
		assertFalse(temp.hashCode() == temp2.hashCode());
	}
}
