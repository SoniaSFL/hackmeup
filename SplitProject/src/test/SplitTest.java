package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.Tools;

class SplitTest {

	@Test
	void emptyStringAndDelimiterTest() {
	    String[] realResult = Tools.split("","");
	    String[] expectedResult = {};
	    assertEquals(expectedResult.length, realResult.length);
	}
	
	@Test
	void emptyStringTest() {
	    String[] realResult = Tools.split("",",");
	    String[] expectedResult = {};
	    assertEquals(expectedResult.length, realResult.length);
	}
	
	@Test
	void emptyDelimiterTest() {
	    String[] realResult = Tools.split("a,b,c","");
	    String[] expectedResult = {"a,b,c"};
	    assertEquals(expectedResult.length, realResult.length);
		for (int i = 0; i < expectedResult.length; i++) {
			assertEquals(expectedResult[i], realResult[i]);
		}
	}
	
	@Test
	void delimiterBiggerThanStringTest() {
	    String[] realResult = Tools.split("ab","abc");
	    String[] expectedResult = {"ab"};
	    assertEquals(expectedResult.length, realResult.length);
		for (int i = 0; i < expectedResult.length; i++) {
			assertEquals(expectedResult[i], realResult[i]);
		}
	}
	
	@Test
	void oneCharDelimiterTest() {
	    String[] realResult = Tools.split("a,b,c",",");
	    String[] expectedResult = {"a","b","c"};
	    assertEquals(expectedResult.length, realResult.length);
		for (int i = 0; i < expectedResult.length; i++) {
			assertEquals(expectedResult[i], realResult[i]);
		}
	}
	
	@Test
	void twoCharDelimiterTest() {
	    String[] realResult = Tools.split("abcbd","bc");
	    String[] expectedResult = {"a","bd"};
	    assertEquals(expectedResult.length, realResult.length);
		for (int i = 0; i < expectedResult.length; i++) {
			assertEquals(expectedResult[i], realResult[i]);
		}
	}
	
	@Test
	void threeCharDelimiterTest() {
	    String[] realResult = Tools.split("bc,bc,abc,bdbcbc,abbbc,bc,","bc,");
	    String[] expectedResult = {"a","bdbc","abb"};
	    assertEquals(expectedResult.length, realResult.length);
		for (int i = 0; i < expectedResult.length; i++) {
			assertEquals(expectedResult[i], realResult[i]);
		}
	}

}
