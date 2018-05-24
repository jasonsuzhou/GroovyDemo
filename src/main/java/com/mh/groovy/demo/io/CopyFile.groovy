package com.mh.groovy.demo.io

class CopyFile {
	
	static void main(String[] args) {
		def source = "./src/main/resources/test.txt";
		def target = './src/main/resources/target.txt';
		// append mode
		new File(target) << new File(source).text;
	}

}
