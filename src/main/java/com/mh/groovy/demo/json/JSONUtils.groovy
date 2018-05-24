package com.mh.groovy.demo.json

import groovy.json.JsonOutput;
import groovy.json.JsonSlurper
import groovy.json.JsonParserType;

class JSONUtils {
	
	def static <T> String toJSONString(T object) {
		return JsonOutput.toJson(object);
	}
	
	def static Object parserHttpResponse(String jsonText) {
		def parser = new JsonSlurper().setType(JsonParserType.LAX);
		return parser.parseText(jsonText);
	}
	
	static void main(String[] args) {
		Person person = new Person();
		person.age = 28;
		person.name = 'jason';
		def jsonString = toJSONString(person);
		println jsonString;
		
		File jsonFile = new File("./src/main/resources/persons.json");
		String jsonText = jsonFile.text;
		println jsonText;
		def jsonObj = parserHttpResponse(jsonText);
		println jsonObj.name;
		println jsonObj.age;
	}

}
