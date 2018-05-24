package com.mh.groovy.demo.trait

trait Marks extends SuperMarks implements Total {
	
	int marks;
	
	void displayMarks() {
		this.marks = 10;
		println "Display Marks:$marks";
	}
	
	void displayTotal() {
		println 'Display Total';
	}

}
