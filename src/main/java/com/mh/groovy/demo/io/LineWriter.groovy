package com.mh.groovy.demo.io

class LineWriter {
	
	static void main(String[] args) {
		String filePath = "./src/main/resources/write.txt";
		new File(filePath).withWriter("utf-8") {
			writer -> writer.writeLine('Hello Jason');
		}
	}

}
