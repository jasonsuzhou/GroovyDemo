package com.mh.groovy.demo.io

class LineReader {
	
	static void main(String[] args) {
		String filePath = "./src/main/resources/test.txt";
		File file = new File(filePath);
		file.eachLine({
			line -> println "line content::$line";
		})
		
		println file.absolutePath;
		println file.length();
		println "The file ${file.absolutePath} has ${file.length()} bytes"
	}

}
