package com.mh.groovy.demo.xml

import groovy.util.XmlParser
import groovy.util.Node

class XMLReader {
	
	def static Node getRootElement(String filePath) {
		File file = new File(filePath);
		return getRootElement(file);
	}
	
	def static Node getRootElement(File file) {
		return new XmlParser().parse(file);
	}
	
	def static String getAttributeValue(Node node, String attrName) {
		if (node != null) {
			return node.attribute(attrName);
		}
		return null;
	}
	
	static void main(String[] args) {
		String filePath = './src/main/resources/persons.xml';
		Node persons = getRootElement(filePath);
		println persons.@country;
		println getAttributeValue(persons, 'country');
		
		println persons.person[0].@gender
		println persons.person[0].name.text();
		println persons.person[0].age.text();
	}
	
}
