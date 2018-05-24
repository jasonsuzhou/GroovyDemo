package com.mh.groovy.demo.test

import junit.framework.Test
import junit.textui.TestRunner

class TestSuite {
	
	static Test suite() {
		def allTest = new GroovyTestSuite();
		allTest.addTestSuite(TestExample.class);
		return allTest;
	}
	
	static void main(String[] args) {
		TestRunner.run(suite());
	}

}
