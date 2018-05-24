package com.mh.groovy.demo.io

class FileReader {
	
	static void main(String[] args) {
		String filePath = "./src/main/java/com/mh/groovy/demo/io";
		new File(filePath).eachFile() {
			file -> println file.getAbsolutePath()
		}
	}

}
