package com.mh.groovy.demo.base

class MapSample {
	
	static void main(String[] args) {
		def map = ["jason":28,"salk":29];
		for (i in map) {
			println(i);
		}
		println(map.containsKey('jason')); // true
		println(map.get('salk')); // 29
		Set keySet = map.keySet();
		println(keySet); // [jason, salk]
		println(map.values()); // [28, 29]
		map.put("aine", 30);
		println(map); // [jason:28, salk:29, aine:30]
		println(map.size()); // 3
	}

}
