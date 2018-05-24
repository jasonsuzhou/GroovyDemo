package com.mh.groovy.demo.base

class ArraySample {

	static void main(String[] args) {
		// Array related methods
		def array = [1, 2, 3, [8, 9, 10], 5, 6, 7];
		array.add(11);
		println(array); // [1, 2, 3, [8, 9, 10], 5, 6, 7, 11]
		println(array.contains(11)); // true
		println(array.get(3)); // [8, 9, 10]
		println(array.isEmpty()); // false
		def newArray = [];
		newArray = array.minus([1, 3]);
		println(newArray); // [2, [8, 9, 10], 5, 6, 7, 11]
		newArray = array.plus([12, 13]);
		println(newArray); // [1, 2, 3, [8, 9, 10], 5, 6, 7, 11, 12, 13]
		// remove the last element and return the last element
		def rtnElement = newArray.pop();
		println(rtnElement); // 13
		println(newArray); // [1, 2, 3, [8, 9, 10], 5, 6, 7, 11, 12]
		println(newArray.reverse()); // [12, 11, 7, 6, 5, [8, 9, 10], 3, 2, 1]
		println(newArray.sort()); // [1, 2, 3, 5, 6, 7, 11, 12, [8, 9, 10]]
		println(newArray.size()); // 9
		def removedElement = newArray.remove(1);
		println(removedElement); // 2
		println(newArray); // [1, 3, 5, 6, 7, 11, 12, [8, 9, 10]]
		println(newArray.size()); // 8
	}
	
}
