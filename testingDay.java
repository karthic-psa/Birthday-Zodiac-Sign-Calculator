package BirthDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class testingDay {

	@Test
	public void tests() {
		 
		dayFinder day = new dayFinder();
		assertEquals("Sunday",day.dayOfWeek(6,26,2016));
	}
	@Test
	public void tests1() {
		 
		dayFinder day = new dayFinder();
		assertEquals("Friday",day.dayOfWeek(3,18,2005));
	}
	@Test
	public void tests2() {
		 
		dayFinder day = new dayFinder();
		assertEquals("Monday",day.dayOfWeek(11,1,2004));
	}
	@Test
	public void tests3() {
		 
		dayFinder day = new dayFinder();
		assertEquals("Wednesday",day.dayOfWeek(06,04,2003));
	}
	@Test
	public void tests4() {
		 
		dayFinder day = new dayFinder();
		assertEquals("Thursday",day.dayOfWeek(05,10,2001));
	}
	@Test
	public void tests5() {
		 
		dayFinder day = new dayFinder();
		assertEquals("Wednesday",day.dayOfWeek(03,31,1999));
	}
	@Test
	public void tests6() {
		 
		dayFinder day = new dayFinder();
		assertEquals("Friday",day.dayOfWeek(07,25,1997));
	}
	@Test
	public void tests7() {
		 
		dayFinder day = new dayFinder();
		assertEquals("Tuesday",day.dayOfWeek(05,23,1995));
	}
	@Test
	public void tests8() {
		 
		dayFinder day = new dayFinder();
		assertEquals("Monday",day.dayOfWeek(9,07,1992));
	}
	@Test
	public void tests9() {
		 
		dayFinder day = new dayFinder();
		assertEquals("wednesday",day.dayOfWeek(02,18,2009));
	}
	@Test
	public void tests10() {
		 
		dayFinder day = new dayFinder();
		assertEquals("Tuesday",day.dayOfWeek(04,24,2012));
	}
	

}
