package com.mh.groovy.demo.template
import groovy.text.XmlTemplateEngine
class XMLTemplate {

	static void main(String[] args) {
		def text = '''
   <document xmlns:gsp='http://groovy.codehaus.org/2005/gsp'>
      <Student>
         <name>${StudentName}</name>
         <ID>${id}</ID>
         <subject>${subject}</subject>
      </Student>
   </document> 
''' 
		def binding = [StudentName: 'Joe', id: 1, subject: 'Physics']
		def engine = new XmlTemplateEngine()
		def template = engine.createTemplate(text).make(binding)
		println template.toString()
	}
	
}
