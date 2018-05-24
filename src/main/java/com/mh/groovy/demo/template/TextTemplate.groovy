package com.mh.groovy.demo.template

class TextTemplate {
	
	static void main(String[] args) {
		String replaceStr = "Jason";
		String content = "Hello::${replaceStr}";
		println content;
	}

}
