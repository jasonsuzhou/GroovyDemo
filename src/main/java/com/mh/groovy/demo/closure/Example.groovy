package com.mh.groovy.demo.closure

class Example {
	
	def static void closWithPara() {
		def clos = {para -> println "Hello World:$para"};
		clos.call('Jason');
	}
	
	/**
	 * 'it' is the key word in Groovy
	 */
	def static void closWithIt() {
		def clos = {println "Hello World:$it"};
		clos.call('Jason');
	}
	
	def static closWithVariable() {
		def name = 'Jason';
		def clos = {para -> println "Hello World:$name, I'm $para"};
		clos.call('Salk');
		name = 'Aine';
		clos.call('Salk');
	}
	
	def static executeClos(clo) {
		clo.call();
	}
	
	static void main(String[] args) {
		def clos = {println 'Hello World'};
		clos.call();
		
		closWithPara();
		closWithIt();
		closWithVariable();
		
		executeClos({println 'Hello World:executeClos'});
	}

}
