package pl.kriss3.atHomeLab;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.kriss3.inClassLab.Date;

public class TestDateClass {

	@Test
	public void TestThatYearIsALeapYear() {
		Date d = new Date(21,02,2016);
		int year = 2016;
		boolean result = d.isLearpYear(year);
		assertTrue(result);		
	}

}
