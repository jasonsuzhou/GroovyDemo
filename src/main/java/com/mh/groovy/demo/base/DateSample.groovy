package com.mh.groovy.demo.base

class DateSample {
	
	def static void methodAfter() {
		Date oldDate = new Date("05/20/2018");
		Date newDate = new Date("05/22/2018");
		println oldDate.after(newDate); // false
		println newDate.after(oldDate); // true
	}
	
	def static void methodBefore() {
		Date oldDate = new Date("05/20/2018");
		Date newDate = new Date("05/22/2018");
		println oldDate.before(newDate); // true
		println newDate.before(oldDate); // false
	}
	
	static void main(String[] args) {
		Date date = new Date();
		println date.toString();
		methodAfter();
		methodBefore();
	}

}
