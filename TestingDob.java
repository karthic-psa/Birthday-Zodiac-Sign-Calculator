package BirthDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingDob {

	@Test
	public void test() {
		checkDate db = new checkDate();
		assertEquals(false,db.checkingDate(02,31,2004));
	
	}
	@Test
	public void test1() {
		checkDate db = new checkDate();
		assertEquals(true,db.checkingDate(02,29,2004));
		
	}
	@Test
	public void test2() {
		checkDate db = new checkDate();
		assertEquals(false,db.checkingDate(42,30,2004));
		
	}
	@Test
	public void test3() {
		checkDate db = new checkDate();
		assertEquals(true,db.checkingDate(07,31,1947));
		
	}
	@Test
	public void test4() {
		checkDate db = new checkDate();
		assertEquals(true,db.checkingDate(8,31,2016));
		
	}
	@Test
	public void test5() {
		checkDate db = new checkDate();
		assertEquals(true,db.checkingDate(9,30,1865));
		
	}
	@Test
	public void test6() {
		checkDate db = new checkDate();
		assertEquals(false,db.checkingDate(10,31,19996));
		
	}
	@Test
	public void test7() {
		checkDate db = new checkDate();
		assertEquals(false,db.checkingDate(11,31,2015));
		
	}
	@Test
	public void test8() {
		checkDate db = new checkDate();
		assertEquals(true,db.checkingDate(12,31,2012));
		
	}
	@Test
	public void test9() {
		checkDate db = new checkDate();
		assertEquals(true,db.checkingDate(01,45,2011));
		
	}
	@Test
	public void test10() {
		checkDate db = new checkDate();
		assertEquals(true,db.checkingDate(9,15,2012));
		
	}

}
