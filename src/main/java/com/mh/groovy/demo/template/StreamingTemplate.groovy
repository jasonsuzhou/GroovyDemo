package com.mh.groovy.demo.template

import groovy.text.StreamingTemplateEngine

class StreamingTemplate {
	
	static void main(String[] args) {
		def binding = ["TutorialName":"Groovy", "Topic":"Templates"]
		def text = new File('./src/main/resources/template.txt').text;
		def engine = new StreamingTemplateEngine()
		def template = engine.createTemplate(text)
		def result = template.make(binding)
		println result
	}

}
