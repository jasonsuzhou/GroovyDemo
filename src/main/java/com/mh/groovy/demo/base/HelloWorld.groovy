package com.mh.groovy.demo.base

class HelloWorld {
	
	static void main(String[] args) {
		println('Hello World');
		
		def name = 'Jason';
		println('Hello ' + name);
		
		def x = 5;
		def X = 6;
		println('The x is::'+x+' and the X is::'+X);
		
		println(name[1]); // a
		println(name[1..3]); // aso
		println(name[-1]); // n
		println(name[4..2]); // nos
		
		println(name * 3); // JasonJasonJason
	}
	
}
