package com.mh.groovy.demo.closure

class CollectionsExample {

	def static mapClos() {
		def map = ["Jason":28,"Salk":29];
		map.each({println it});
		map.each({println "$it.key:$it.value"});
	}

	/**
	 * only return the first element which matches the condition
	 * @return
	 */
	def static findMethod() {
		def array = [1, 2, 3, 4, 5, 6];
		def value = array.find({num -> num > 3});
		println(value);
	}

	/**
	 * return all the element which matches the condition
	 * @return
	 */
	def static findAllMethod() {
		def array = [1, 2, 3, 4, 5, 6];
		def value = array.findAll({num -> num > 3});
		println(value);
	}

	/**
	 * if one of them matches, it will return true
	 * @return
	 */
	def static anyMethod() {
		def array = [1, 2, 3, 4, 5, 6];
		def value = array.any({num -> num > 3});
		println(value); // true
	}
	
	/**
	 * if all of the elements matches, it will return true
	 * @return
	 */
	def static everyMethod() {
		def array = [1, 2, 3, 4, 5, 6];
		def value = array.every({num -> num > 3});
		println(value); // false
	}
	
	/**
	 * convert each of the element to a new collection
	 * @return
	 */
	def static collectMethod() {
		def array = [1, 2, 3, 4, 5, 6];
		def newArray = [];
		newArray = array.collect({num -> return num + num});
		println(newArray); // [2, 4, 6, 8, 10, 12]
	}
	
	static void main(String[] args) {
		def array = [1, 2, 3, 4, 5, 6];
		array.each({println it});
		array.each({num -> if (num%2 == 0) println num});

		mapClos();
		findMethod();
		findAllMethod();
		anyMethod();
		everyMethod();
		collectMethod();
	}
}
