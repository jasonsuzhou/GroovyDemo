package com.mh.groovy.demo.test

class TestExample extends GroovyTestCase {
	
	void testDispaySuccess() {
		String expected = 'hello';
		String actual = 'hello';
		assertToString(actual, expected);
	}

	void testDispayFailed() {
		String expected = 'hello';
		String actual = 'world';
		assertToString(actual, expected);
	}
	
}
