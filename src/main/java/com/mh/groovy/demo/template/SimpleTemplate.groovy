package com.mh.groovy.demo.template
import groovy.text.SimpleTemplateEngine;
class SimpleTemplate {
	
	static void main(String[] args) {
		def binding = ["TutorialName":"Groovy", "Topic":"Templates"]  
		def text = new File('./src/main/resources/template.txt').text;
		def engine = new SimpleTemplateEngine()
		def template = engine.createTemplate(text).make(binding)
		println template
	}

}
