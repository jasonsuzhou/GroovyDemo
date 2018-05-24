package com.mh.groovy.demo.base

class Method {
	
	static def sayHello() {
		println('Hello');
	}
	
	static def sum(int a, int b) {
		int result = a + b;
		println(result);
	}
	
	static def sum2(int a, int b = 6) {
		int result = a + b;
		println(result);
	}
	
	static int sum3(int a, int b) {
		int result = a + b;
		return result;
	}
	
	static void main(String[] args) {
		sayHello(); // Hello
		sum(5, 6); // 11
		sum2(5); // 11
		sum2(5, 7); // 12
		println(sum3(6,6)); // 12
	}
	
}
