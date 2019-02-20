package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class EqualsTester {
	/*
	* P1: For any non-null reference value x, x.equals(null) should return false.
	*/
	@Test public void t0() {
		assertFalse(new Object().equals(null));
	}
	// your test methods for P1 go here
	
	@Test public void property1_C() {
		C temp = new C(0);
		assertFalse(temp.equals(null));
	}
	
	@Test public void property1_D() {
		D temp = new D(0,0);
		assertFalse(temp.equals(null));
	}
	
	@Test public void property1_Obj() {
		Object temp = new Object();
		assertFalse(temp.equals(null));
	}
	
	/*
	* P2: It is reflexive: for any non-null reference value x, x.equals(x)
	* should return true.
	*/
	// your test methods for P2 go here
	
	
	
	@Test public void propert2_C() {
		C temp = new C(0);
		assertTrue(temp.equals(temp));
	}
	
	@Test public void propert2_D() {
		D temp = new D(0,0);
		assertTrue(temp.equals(temp));
	}
	
	@Test public void propert2_Obj() {
		Object temp = new Object();
		assertTrue(temp.equals(temp));
	}
	
	
	/*
	* P3: It is symmetric: for any non-null reference values x and y, x.equals(y)
	* should return true if and only if y.equals(x) returns true.
	*/
	// your test methods for P3 go here
	
	
	@Test public void propert3_CC() {
		C temp = new C(0);
		C temp2 = temp;
		assertTrue(temp2.equals(temp) && temp.equals(temp2));
	}
	
	@Test public void propert3_CD() {
		C temp = new C(0);
		D temp2 = new D(0,0);
		assertFalse(temp2.equals(temp) && temp.equals(temp2));
	}
	
	@Test public void propert3_CObj() {
		C temp = new C(0);
		Object temp2 = new Object();
		assertFalse(temp2.equals(temp) && temp.equals(temp2));
	}
	
////////////////////////////////////////////////////
	@Test public void propert3_DC() {
		D temp = new D(0,0);
		C temp2 = new C(0);
		assertFalse(temp2.equals(temp) && temp.equals(temp2));
	}
	
	@Test public void propert3_DD() {
		D temp = new D(0,0);
		D temp2 = temp;
		assertTrue(temp2.equals(temp) && temp.equals(temp2));
	}
	
	@Test public void propert3_DObj() {
		D temp = new D(0,0);
		Object temp2 = new Object();
		assertFalse(temp2.equals(temp) && temp.equals(temp2));
	}
	
//////////////////////////////////////////////////////
	@Test public void propert3_ObjC() {
		Object temp = new Object();
		Object temp2 = new Object();
		assertTrue(temp2.equals(temp) && temp.equals(temp2));
	}
	
	@Test public void propert3_ObjD() {
		Object temp = new Object();
		D temp2 = new D(0,0);
		assertFalse(temp2.equals(temp) && temp.equals(temp2));
	}
	
	@Test public void propert3_ObjObj() {
		Object temp = new Object();
		C temp2 = new C(0);
		assertFalse(temp2.equals(temp) && temp.equals(temp2));
	}
	
	/*
	* P4: It is transitive: for any non-null reference values x, y, and z,
	* if x.equals(y) returns true and y.equals(z) returns true, then
	* x.equals(z) should return true.
	*/
	// you do not need to write tests fo
}
