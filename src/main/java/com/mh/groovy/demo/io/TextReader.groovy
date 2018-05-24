package com.mh.groovy.demo.io

class TextReader {
	
	static void main(String[] args) {
		def filePath = './src/main/resources/test.txt';
		File file = new File(filePath);
		def content = file.text;
		println content;
		
		println "File? ${file.isFile()}";
		println "Directory? ${file.isDirectory()}";
	}

}
