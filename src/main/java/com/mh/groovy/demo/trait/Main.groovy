package com.mh.groovy.demo.trait

class Main {
	
	static void main(String[] args) {
		Student stu = new Student();
		stu.studentId = 1;
		stu.marks1 = 4;
		stu.displayMarks();
		stu.displayTotal();
	}

}
