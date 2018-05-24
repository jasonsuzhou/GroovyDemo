package com.mh.groovy.demo.base

class RangeSample {

	static void main(String[] args) {
		def range = 0..5;
		println(range); // [0, 1, 2, 3, 4, 5]
		println(range.contains(3)); // true
		println(range.getFrom()); // 0
		println(range.getTo()); // 5
		
		def value = range.get(2);
		println(value); // 2
		
		println(range.subList(1, 3)); // [1, 2]
		
		println(range.size()); // 6
		
		println(range.isReverse()); // false
		
	}
	
}
