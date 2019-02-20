package pset1;

import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

public class SLListRepOkTester {
	
	@Test public void t0() {
		SLList l = new SLList();
		assertTrue(l.repOk());
	}
	
	@Test public void t1() {
		SLList l = new SLList();
		Node n = new Node();
		// your code goes here
		
		l.header = n;
		//assertTrue(l.header.equals(n));
		assertTrue(l.repOk());
	}
	// your code goes here
	
	@Test public void t2() {
		SLList l = new SLList();
		Node n = new Node();
		// your code goes here
		n.next = n;
		l.header = n;
		
		assertTrue(!l.repOk());
	}	

/////////////////////////////////////////////////////////////////
	//2 elements cyclic and asyclic
	@Test public void t3() {
		SLList l = new SLList();
		Node n = new Node();
		Node w = new Node();
		// your code goes here
		w.next = null;
		n.next = w;

		l.header = n;
		
		assertTrue(l.repOk());
	}
	
	@Test public void t4() {
		SLList l = new SLList();
		Node n = new Node();
		Node w = new Node();
		// your code goes here
		w.next = n;
		n.next = w;

		l.header = n;
		
		assertTrue(!l.repOk());
	}
	
}